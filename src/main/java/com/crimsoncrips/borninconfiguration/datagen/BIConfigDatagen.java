package com.crimsoncrips.borninconfiguration.datagen;

import com.crimsoncrips.borninconfiguration.BornInConfiguration;
import com.crimsoncrips.borninconfiguration.datagen.tags.BIConfigBlockTagGenerator;
import com.crimsoncrips.borninconfiguration.datagen.tags.BIConfigItemTagGenerator;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;



@Mod.EventBusSubscriber(modid = BornInConfiguration.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BIConfigDatagen {
    //Giga Props to Drull and TF for assistance (and code yoinking)//
    public static void generateData(GatherDataEvent event) {
        boolean isServer = event.includeServer();
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        BIConfigBlockTagGenerator blocktags = new BIConfigBlockTagGenerator(output, provider, helper);
        generator.addProvider(event.includeServer(), blocktags);
        generator.addProvider(event.includeServer(), new BIConfigItemTagGenerator(output, provider, blocktags.contentsGetter(), helper));

    }

}
