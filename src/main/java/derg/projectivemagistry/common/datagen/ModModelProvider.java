package derg.projectivemagistry.common.datagen;


import derg.projectivemagistry.common.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.ASH_LOG).log(ModBlocks.ASH_LOG).wood(ModBlocks.ASH_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.ASH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ASH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.HAZEL_LOG).log(ModBlocks.HAZEL_LOG).wood(ModBlocks.HAZEL_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HAZEL_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.HAZEL_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.HAZEL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.HOLLY_LOG).log(ModBlocks.HOLLY_LOG).wood(ModBlocks.HOLLY_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HOLLY_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.HOLLY_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.HOLLY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.YEW_LOG).log(ModBlocks.YEW_LOG).wood(ModBlocks.YEW_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YEW_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.YEW_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.YEW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);



    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
//    @Override
//    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//
//    }
}
