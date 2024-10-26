package derg.projectivemagistry.common.world;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


public class ModPlacedFeatures {


    //
//
    public static final RegistryKey<PlacedFeature> ASH_PLACED_KEY = registerKey("ash_placed");
    public static final RegistryKey<PlacedFeature> HAZEL_PLACED_KEY = registerKey("hazel_placed");

    public static final RegistryKey<PlacedFeature> HOLLY_PLACED_KEY = registerKey("holly_placed");
    public static final RegistryKey<PlacedFeature> YEW_PLACED_KEY = registerKey("yew_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup=context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context,ASH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ASH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2),ModBlocks.ASH_SAPLING));

        register(context,HAZEL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HAZEL_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2),ModBlocks.HAZEL_SAPLING));

        register(context,HOLLY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HOLLY_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2),ModBlocks.HOLLY_SAPLING));

        register(context,YEW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YEW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2),ModBlocks.YEW_SAPLING));



    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ProjectiveMagistry.MOD_ID, name));
    }


    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}