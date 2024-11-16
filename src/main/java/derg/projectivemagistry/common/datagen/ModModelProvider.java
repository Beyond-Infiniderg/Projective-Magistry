package derg.projectivemagistry.common.datagen;


import derg.projectivemagistry.common.block.ModBlocks;
import derg.projectivemagistry.common.item.ModItems;
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
        BlockStateModelGenerator.BlockTexturePool ashTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ASH_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.ASH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ASH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(ModBlocks.HAZEL_LOG).log(ModBlocks.HAZEL_LOG).wood(ModBlocks.HAZEL_WOOD);
        BlockStateModelGenerator.BlockTexturePool hazelTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HAZEL_PLANKS);

        blockStateModelGenerator.registerSingleton(ModBlocks.HAZEL_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.HAZEL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.HOLLY_LOG).log(ModBlocks.HOLLY_LOG).wood(ModBlocks.HOLLY_WOOD);
        BlockStateModelGenerator.BlockTexturePool hollyTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HOLLY_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.HOLLY_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.HOLLY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.YEW_LOG).log(ModBlocks.YEW_LOG).wood(ModBlocks.YEW_WOOD);
        BlockStateModelGenerator.BlockTexturePool yewTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YEW_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.YEW_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.YEW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoor(ModBlocks.ASH_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ASH_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.HAZEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.HAZEL_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.HOLLY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.HOLLY_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.YEW_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.YEW_TRAPDOOR);


        ashTexturePool.stairs(ModBlocks.ASH_STAIRS);
        ashTexturePool.slab(ModBlocks.ASH_SLAB);
        ashTexturePool.fence(ModBlocks.ASH_FENCE);
        ashTexturePool.fenceGate(ModBlocks.ASH_FENCE_GATE);
        ashTexturePool.wall(ModBlocks.ASH_WALL);
        ashTexturePool.button(ModBlocks.ASH_BUTTON);
        ashTexturePool.pressurePlate(ModBlocks.ASH_PRESSURE_PLATE);



        hazelTexturePool.stairs(ModBlocks.HAZEL_STAIRS);
        hazelTexturePool.slab(ModBlocks.HAZEL_SLAB);
        hazelTexturePool.fence(ModBlocks.HAZEL_FENCE);
        hazelTexturePool.fenceGate(ModBlocks.HAZEL_FENCE_GATE);
        hazelTexturePool.wall(ModBlocks.HAZEL_WALL);
        hazelTexturePool.button(ModBlocks.HAZEL_BUTTON);
        hazelTexturePool.pressurePlate(ModBlocks.HAZEL_PRESSURE_PLATE);

        hollyTexturePool.stairs(ModBlocks.HOLLY_STAIRS);
        hollyTexturePool.slab(ModBlocks.HOLLY_SLAB);
        hollyTexturePool.fence(ModBlocks.HOLLY_FENCE);
        hollyTexturePool.fenceGate(ModBlocks.HOLLY_FENCE_GATE);
        hollyTexturePool.wall(ModBlocks.HOLLY_WALL);

        hollyTexturePool.button(ModBlocks.HOLLY_BUTTON);
        hollyTexturePool.pressurePlate(ModBlocks.HOLLY_PRESSURE_PLATE);


        yewTexturePool.stairs(ModBlocks.YEW_STAIRS);
        yewTexturePool.slab(ModBlocks.YEW_SLAB);
        yewTexturePool.fence(ModBlocks.YEW_FENCE);
        yewTexturePool.fenceGate(ModBlocks.YEW_FENCE_GATE);
        yewTexturePool.wall(ModBlocks.YEW_WALL);

        yewTexturePool.button(ModBlocks.YEW_BUTTON);
        yewTexturePool.pressurePlate(ModBlocks.YEW_PRESSURE_PLATE);




    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SILVER_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEMON_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHALK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHALK_E, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHALK_G, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHALK_N, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHALK_R, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLOOD_VIAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ATHAME, Models.GENERATED);


    }
}
