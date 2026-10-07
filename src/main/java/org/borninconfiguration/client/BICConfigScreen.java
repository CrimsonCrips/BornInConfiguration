package org.borninconfiguration.client;

import com.electronwill.nightconfig.core.UnmodifiableConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ContainerObjectSelectionList;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.narration.NarratableEntry;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.common.ModConfigSpec;
import org.borninconfiguration.BornInConfiguration;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@OnlyIn(Dist.CLIENT)
public class BICConfigScreen extends Screen {

    private enum Tab {
        GENERAL("misc.borninconfiguration.config_tab_general", "General"),
        WEAPONS("misc.borninconfiguration.config_tab_weapons", "Weapons"),
        ARMOR("misc.borninconfiguration.config_tab_armor", "Armor"),
        MOBS("misc.borninconfiguration.config_tab_mobs", "Weapons", "Mobs");

        private final String translationKey;
        private final List<String> path;

        Tab(String translationKey, String... path) {
            this.translationKey = translationKey;
            this.path = List.of(path);
        }
    }

    private static final int TAB_TOP = 22;
    private static final int TAB_WIDTH = 80;
    private static final int TAB_HEIGHT = 20;
    private static final int SEARCH_TOP = 46;
    private static final int LIST_TOP = 70;
    private static final int FOOTER_HEIGHT = 58;
    private static final int ROW_HEIGHT = 24;
    private static final int ROW_WIDTH = 340;
    private static final int CONTROL_WIDTH = 130;
    private static final int CONTROL_HEIGHT = 18;
    private static final int CYCLE_RANGE_LIMIT = 8;
    private static final int NOTE_COLOR = 0xFFD84A;

    private final Screen parent;
    private final boolean remote;
    private Tab tab = Tab.GENERAL;
    private String filter = "";
    private EditBox search;
    private ConfigList list;

    public BICConfigScreen(Screen parent) {
        super(Component.translatable("misc.borninconfiguration.config_title"));
        this.parent = parent;
        Minecraft minecraft = Minecraft.getInstance();
        this.remote = minecraft.getConnection() != null && !minecraft.hasSingleplayerServer();
    }

    @Override
    protected void init() {
        Tab[] tabs = Tab.values();
        int tabsLeft = this.width / 2 - (tabs.length * TAB_WIDTH + (tabs.length - 1) * 2) / 2;
        for (int i = 0; i < tabs.length; i++) {
            Tab entry = tabs[i];
            Button button = Button.builder(Component.translatable(entry.translationKey), b -> {
                this.tab = entry;
                this.filter = "";
                this.rebuildWidgets();
            }).bounds(tabsLeft + i * (TAB_WIDTH + 2), TAB_TOP, TAB_WIDTH, TAB_HEIGHT).build();
            button.active = entry != this.tab;
            this.addRenderableWidget(button);
        }

        this.search = new EditBox(this.font, this.width / 2 - ROW_WIDTH / 2, SEARCH_TOP, ROW_WIDTH, 18, Component.translatable("misc.borninconfiguration.config_search"));
        this.search.setHint(Component.translatable("misc.borninconfiguration.config_search"));
        this.search.setValue(this.filter);
        this.search.setResponder(text -> {
            this.filter = text;
            this.refill();
        });
        this.addRenderableWidget(this.search);

        this.list = new ConfigList(this.minecraft);
        this.refill();
        this.addRenderableWidget(this.list);

        this.addRenderableWidget(Button.builder(CommonComponents.GUI_DONE, b -> this.onClose())
                .bounds(this.width / 2 - 100, this.height - 28, 200, 20).build());
    }

    private void refill() {
        this.list.clear();
        if (this.remote) {
            this.list.addNote(Component.translatable("misc.borninconfiguration.config_note_remote"));
        }
        Object node = BornInConfiguration.COMMON_CONFIG_SPEC.getValues().get(this.tab.path);
        if (node instanceof UnmodifiableConfig section) {
            populate(section, "", this.filter.trim().toLowerCase(Locale.ROOT));
        }
        this.list.setScrollAmount(0);
    }

    private void populate(UnmodifiableConfig values, String sectionName, String query) {
        boolean sectionMatches = !query.isEmpty() && sectionName.toLowerCase(Locale.ROOT).contains(query);
        boolean headerAdded = sectionName.isEmpty();
        for (Map.Entry<String, Object> entry : values.valueMap().entrySet()) {
            if (entry.getValue() instanceof UnmodifiableConfig section) {
                if (this.tab != Tab.MOBS && entry.getKey().equals("Mobs")) {
                    continue;
                }
                populate(section, sectionTitle(entry.getKey()), query);
            } else if (entry.getValue() instanceof ModConfigSpec.ConfigValue<?> value) {
                Component label = label(value);
                if (!query.isEmpty() && !sectionMatches && !label.getString().toLowerCase(Locale.ROOT).contains(query)) {
                    continue;
                }
                AbstractWidget control = control(value);
                if (control == null) {
                    continue;
                }
                if (!headerAdded) {
                    this.list.addHeader(Component.literal(sectionName));
                    headerAdded = true;
                }
                if (this.remote) {
                    control.active = false;
                    if (control instanceof EditBox box) {
                        box.setEditable(false);
                    }
                }
                this.list.addRow(label, value.getSpec().getComment(), control);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private AbstractWidget control(ModConfigSpec.ConfigValue<?> value) {
        if (value instanceof ModConfigSpec.BooleanValue booleanValue) {
            return booleanButton(booleanValue);
        }
        if (value instanceof ModConfigSpec.IntValue intValue) {
            ModConfigSpec.Range<Integer> range = intValue.getSpec().getRange();
            if (range != null && (long) range.getMax() - range.getMin() < CYCLE_RANGE_LIMIT) {
                return cycleButton(intValue, range);
            }
            return intBox(intValue, range);
        }
        if (value instanceof ModConfigSpec.DoubleValue doubleValue) {
            return doubleBox(doubleValue);
        }
        if (value.getDefault() instanceof String) {
            return stringBox((ModConfigSpec.ConfigValue<String>) value);
        }
        return null;
    }

    private static Component label(ModConfigSpec.ConfigValue<?> value) {
        List<String> path = value.getPath();
        String name = path.get(path.size() - 1);
        if (name.endsWith("_SPAWNING_ENABLED")) {
            return Component.translatable("misc.borninconfiguration.config_can_spawn");
        }
        if (name.endsWith("_ENABLED")) {
            name = name.substring(0, name.length() - "_ENABLED".length());
        }
        return Component.literal(prettify(name));
    }

    private static String sectionTitle(String key) {
        return key.equals(key.toUpperCase(Locale.ROOT)) ? prettify(key) : key;
    }

    private static String prettify(String name) {
        return Arrays.stream(name.split("[_\\s]+"))
                .filter(word -> !word.isEmpty())
                .map(word -> word.substring(0, 1).toUpperCase(Locale.ROOT) + word.substring(1).toLowerCase(Locale.ROOT))
                .collect(Collectors.joining(" "));
    }

    private Button booleanButton(ModConfigSpec.BooleanValue value) {
        return Button.builder(booleanLabel(value.get()), b -> {
            value.set(!value.get());
            b.setMessage(booleanLabel(value.get()));
        }).bounds(0, 0, CONTROL_WIDTH, CONTROL_HEIGHT).build();
    }

    private static Component booleanLabel(boolean value) {
        return value ? CommonComponents.OPTION_ON : CommonComponents.OPTION_OFF;
    }

    private Button cycleButton(ModConfigSpec.IntValue value, ModConfigSpec.Range<Integer> range) {
        return Button.builder(Component.literal(String.valueOf(value.get())), b -> {
            int next = value.get() + 1;
            value.set(next > range.getMax() ? range.getMin() : next);
            b.setMessage(Component.literal(String.valueOf(value.get())));
        }).bounds(0, 0, CONTROL_WIDTH, CONTROL_HEIGHT).build();
    }

    private EditBox intBox(ModConfigSpec.IntValue value, ModConfigSpec.Range<Integer> range) {
        EditBox box = numberBox(value);
        box.setResponder(text -> {
            try {
                int parsed = Integer.parseInt(text.trim());
                value.set(range == null ? parsed : Mth.clamp(parsed, range.getMin(), range.getMax()));
                box.setTextColor(EditBox.DEFAULT_TEXT_COLOR);
            } catch (NumberFormatException ignored) {
                box.setTextColor(0xFF5555);
            }
        });
        return box;
    }

    private EditBox doubleBox(ModConfigSpec.DoubleValue value) {
        ModConfigSpec.Range<Double> range = value.getSpec().getRange();
        EditBox box = numberBox(value);
        box.setResponder(text -> {
            try {
                double parsed = Double.parseDouble(text.trim());
                value.set(range == null ? parsed : Mth.clamp(parsed, range.getMin(), range.getMax()));
                box.setTextColor(EditBox.DEFAULT_TEXT_COLOR);
            } catch (NumberFormatException ignored) {
                box.setTextColor(0xFF5555);
            }
        });
        return box;
    }

    private EditBox numberBox(ModConfigSpec.ConfigValue<?> value) {
        EditBox box = new EditBox(this.font, 0, 0, CONTROL_WIDTH, CONTROL_HEIGHT, label(value));
        box.setMaxLength(32);
        box.setValue(String.valueOf(value.get()));
        return box;
    }

    private EditBox stringBox(ModConfigSpec.ConfigValue<String> value) {
        EditBox box = new EditBox(this.font, 0, 0, CONTROL_WIDTH, CONTROL_HEIGHT, label(value));
        box.setMaxLength(256);
        box.setValue(value.get());
        box.setResponder(value::set);
        return box;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        guiGraphics.drawCenteredString(this.font, this.title, this.width / 2, 8, 0xFFFFFF);
        List<FormattedCharSequence> note = this.font.split(Component.translatable("misc.borninconfiguration.config_note_restart"), this.width - 20);
        int noteTop = this.height - 32 - note.size() * (this.font.lineHeight + 1);
        for (int i = 0; i < note.size(); i++) {
            guiGraphics.drawCenteredString(this.font, note.get(i), this.width / 2, noteTop + i * (this.font.lineHeight + 1), NOTE_COLOR);
        }
    }

    @Override
    public void onClose() {
        if (!this.remote) {
            BornInConfiguration.COMMON_CONFIG_SPEC.save();
        }
        this.minecraft.setScreen(this.parent);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @OnlyIn(Dist.CLIENT)
    private class ConfigList extends ContainerObjectSelectionList<ConfigList.Entry> {

        ConfigList(Minecraft minecraft) {
            super(minecraft, BICConfigScreen.this.width, BICConfigScreen.this.height - LIST_TOP - FOOTER_HEIGHT, LIST_TOP, ROW_HEIGHT);
        }

        void clear() {
            this.clearEntries();
        }

        void addHeader(Component title) {
            this.addEntry(new HeaderEntry(title, 0xFFD84A, true));
        }

        void addNote(Component text) {
            this.addEntry(new HeaderEntry(text, 0xFF8080, false));
        }

        void addRow(Component label, String comment, AbstractWidget control) {
            this.addEntry(new RowEntry(label, comment, control));
        }

        @Override
        public int getRowWidth() {
            return ROW_WIDTH;
        }

        @Override
        protected int getScrollbarPosition() {
            return this.getRowRight() + 6;
        }

        @OnlyIn(Dist.CLIENT)
        abstract class Entry extends ContainerObjectSelectionList.Entry<Entry> {
        }

        @OnlyIn(Dist.CLIENT)
        class HeaderEntry extends Entry {
            private final Component title;
            private final int color;
            private final boolean underline;

            HeaderEntry(Component title, int color, boolean underline) {
                this.title = title;
                this.color = color;
                this.underline = underline;
            }

            @Override
            public void render(GuiGraphics guiGraphics, int index, int top, int left, int width, int height,
                               int mouseX, int mouseY, boolean hovering, float partialTick) {
                Font font = BICConfigScreen.this.font;
                guiGraphics.drawString(font, this.title, left + 2, top + height - font.lineHeight - 4, this.color, false);
                if (this.underline) {
                    guiGraphics.fill(left, top + height - 2, left + width, top + height - 1, 0x60FFFFFF);
                }
            }

            @Override
            public List<? extends GuiEventListener> children() {
                return List.of();
            }

            @Override
            public List<? extends NarratableEntry> narratables() {
                return List.of();
            }
        }

        @OnlyIn(Dist.CLIENT)
        class RowEntry extends Entry {
            private final Component label;
            private final String comment;
            private final AbstractWidget control;

            RowEntry(Component label, String comment, AbstractWidget control) {
                this.label = label;
                this.comment = comment;
                this.control = control;
            }

            @Override
            public void render(GuiGraphics guiGraphics, int index, int top, int left, int width, int height,
                               int mouseX, int mouseY, boolean hovering, float partialTick) {
                Font font = BICConfigScreen.this.font;
                int available = width - CONTROL_WIDTH - 12;
                int textWidth = font.width(this.label);
                float scale = textWidth > available ? available / (float) textWidth : 1f;

                guiGraphics.pose().pushPose();
                guiGraphics.pose().translate(left + 4, top + (height - font.lineHeight * scale) / 2f, 0f);
                guiGraphics.pose().scale(scale, scale, 1f);
                guiGraphics.drawString(font, this.label, 0, 0, 0xFFFFFF, false);
                guiGraphics.pose().popPose();

                if (hovering && this.comment != null && !this.comment.isBlank()) {
                    BICConfigScreen.this.setTooltipForNextRenderPass(font.split(Component.literal(this.comment), 220));
                }

                this.control.setX(left + width - CONTROL_WIDTH);
                this.control.setY(top + (height - CONTROL_HEIGHT) / 2);
                this.control.render(guiGraphics, mouseX, mouseY, partialTick);
            }

            @Override
            public List<? extends GuiEventListener> children() {
                return List.of(this.control);
            }

            @Override
            public List<? extends NarratableEntry> narratables() {
                return List.of(this.control);
            }
        }
    }
}
