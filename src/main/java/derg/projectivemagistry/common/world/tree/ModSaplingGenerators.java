package derg.projectivemagistry.common.world.tree;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator ASH = new SaplingGenerator(ProjectiveMagistry.MOD_ID + ":ash",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASH_KEY), Optional.empty());

    public static final SaplingGenerator HAZEL = new SaplingGenerator(ProjectiveMagistry.MOD_ID + ":hazel",
            Optional.empty(), Optional.of(ModConfiguredFeatures.HAZEL_KEY), Optional.empty());

    public static final SaplingGenerator HOLLY = new SaplingGenerator(ProjectiveMagistry.MOD_ID + ":holly",
            Optional.empty(), Optional.of(ModConfiguredFeatures.HOLLY_KEY), Optional.empty());

    public static final SaplingGenerator YEW = new SaplingGenerator(ProjectiveMagistry.MOD_ID + ":yew",
            Optional.empty(), Optional.of(ModConfiguredFeatures.YEW_KEY), Optional.empty());
}
