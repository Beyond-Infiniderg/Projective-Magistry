package derg.projectivemagistry.common.datagen;

import derg.projectivemagistry.common.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
     blockStateModelGenerator.registerTintableCross(ModBlocks.ASH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
       // blockStateModelGenerator.re
        //       .Sapling(ModBlocks.ASH_SAPLING);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
