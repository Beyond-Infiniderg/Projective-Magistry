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
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ASH_LOG, ModBlocks.ASH_WOOD, ModBlocks.HAZEL_LOG,ModBlocks.HAZEL_LOG,ModBlocks.HOLLY_LOG,ModBlocks.HOLLY_WOOD,ModBlocks.YEW_LOG,ModBlocks.YEW_WOOD);

        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ASH_WALL).add(ModBlocks.HAZEL_WALL).add(ModBlocks.HOLLY_WALL).add(ModBlocks.YEW_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.ASH_FENCE).add(ModBlocks.HAZEL_FENCE).add(ModBlocks.HOLLY_FENCE).add(ModBlocks.YEW_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.ASH_FENCE_GATE).add(ModBlocks.HAZEL_FENCE_GATE).add(ModBlocks.HOLLY_FENCE_GATE).add(ModBlocks.YEW_FENCE_GATE);

    }
}
