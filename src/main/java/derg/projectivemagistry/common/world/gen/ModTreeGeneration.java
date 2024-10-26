package derg.projectivemagistry.common.world.gen;

import derg.projectivemagistry.common.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
public class ModTreeGeneration {

    public static void generateTrees(){

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ASH_PLACED_KEY);


//the spawned in savanna
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HAZEL_PLACED_KEY);
//theyspawn in savanna
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HOLLY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST,BiomeKeys.DARK_FOREST,BiomeKeys.JUNGLE,BiomeKeys.FLOWER_FOREST,BiomeKeys.WOODED_BADLANDS,BiomeKeys.WINDSWEPT_FOREST,BiomeKeys.FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST,BiomeKeys.SPARSE_JUNGLE,BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YEW_PLACED_KEY);


    }

}
