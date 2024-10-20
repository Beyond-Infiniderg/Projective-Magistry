package derg.projectivemagistry.common.datagen;

import derg.projectivemagistry.common.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModblockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModblockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    //    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
     //           .add(ModBlocks.RAW_SILVER_BLOCK)
     //           .add(ModBlocks.SILVER_BLOCK)
     //           .add(ModBlocks.SILVER_ORE)
     //           .add(ModBlocks.DEEPSLATE_SILVER_ORE);
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.ASH_SAPLING)
                .add(ModBlocks.HAZEL_SAPLING)
                .add(ModBlocks.HOLLY_SAPLING)
                .add(ModBlocks.YEW_SAPLING);

    }
}
