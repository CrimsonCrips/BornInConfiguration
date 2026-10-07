package org.borninconfiguration.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.borninconfiguration.datagen.tags.BIConfigBlockTagGenerator;
import org.borninconfiguration.datagen.tags.BIConfigItemTagGenerator;


import java.util.concurrent.CompletableFuture;


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