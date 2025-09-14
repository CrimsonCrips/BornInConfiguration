package org.borninconfiguration.datagen.tags;



import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.borninconfiguration.BornInConfiguration;


import java.util.concurrent.CompletableFuture;

public class BIConfigBlockTagGenerator extends IntrinsicHolderTagsProvider<Block> {
//	public static final TagKey<Block> ABYSSAL_ECOSYSTEM = BlockTags.create(BornInConfiguration.prefix("abyssal_ecosystem"));

	public BIConfigBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> future, ExistingFileHelper helper) {
		super(output, Registries.BLOCK, future, block -> block.builtInRegistryHolder().key(), BornInConfiguration.MODID, helper);
	}

	
	public String getName() {
		return "BIC Block Tags";
	}

	
	protected void addTags(HolderLookup.Provider provider) {

	}
}