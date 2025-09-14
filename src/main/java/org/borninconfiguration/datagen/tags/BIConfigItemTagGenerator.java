package org.borninconfiguration.datagen.tags;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.borninconfiguration.BornInConfiguration;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

public class BIConfigItemTagGenerator extends ItemTagsProvider {
	public static final TagKey<Item> BLOCK_BREAKERS = create("block_breakers");

    public BIConfigItemTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper helper) {
        super(output, future, provider, BornInConfiguration.MODID, helper);
    }

	@SuppressWarnings("unchecked")
    
	protected void addTags(HolderLookup.Provider provider) {

		tag(BLOCK_BREAKERS)
				.addTag(ItemTags.AXES);

	}

	
	public String getName() {
		return "BIC Item Tags";
	}


	public static TagKey<Item> create(String tagName) {
		return ItemTags.create(BornInConfiguration.prefix(tagName));
	}

	public static TagKey<Item> makeForgeTag(String tagName) {
		return ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", tagName));
	}
}