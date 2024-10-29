package derg.projectivemagistry.common.world;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;


import java.util.List;


public class ModConfiguredFeatures  {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY= registryKey( "silver_ore" );

    public static final RegistryKey<ConfiguredFeature<?, ?>> ASH_KEY= registryKey( "ash" );
    public static final RegistryKey<ConfiguredFeature<?, ?>> HAZEL_KEY= registryKey( "hazel" );
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLY_KEY= registryKey( "holly" );
    public static final RegistryKey<ConfiguredFeature<?, ?>> YEW_KEY= registryKey( "yew" );

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    register(context, ASH_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
        BlockStateProvider.of(ModBlocks.ASH_LOG),
        new StraightTrunkPlacer(5,6,3  ),
        BlockStateProvider.of(ModBlocks.ASH_LEAVES),
        new BlobFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(3),3),
        new TwoLayersFeatureSize(1,0,2)).build());
//decides how the tre as a whole looks like its hieght and shit
        register(context, HAZEL_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.HAZEL_LOG),
                new StraightTrunkPlacer(4,4,9  ),
                BlockStateProvider.of(ModBlocks.HAZEL_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(3),3),
                new TwoLayersFeatureSize(1,0,2)).build());

        register(context, HOLLY_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.HOLLY_LOG),
                new StraightTrunkPlacer(4,6,7  ),
                BlockStateProvider.of(ModBlocks.HOLLY_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(3),3),
                new TwoLayersFeatureSize(1,0,2)).build());

        register(context, YEW_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.YEW_LOG),
                new StraightTrunkPlacer(4,8,14  ),
                BlockStateProvider.of(ModBlocks.YEW_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(3),6),
                new TwoLayersFeatureSize(1,0,2)).build());

        RuleTest stoneReplaceables= new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables= new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

//
        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 53) );
    }


    public static RegistryKey<ConfiguredFeature<?, ?>>registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ProjectiveMagistry.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}



















