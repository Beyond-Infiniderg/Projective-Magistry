package derg.projectivemagistry.common.block;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.crystal.budding_crystal_block;
import derg.projectivemagistry.common.block.crystal.crystal_block;
import derg.projectivemagistry.common.block.entity.Pedestal.AncientPedestalBlock;
import derg.projectivemagistry.common.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LEYLINE_CRYSTAL_BLOCK =registerBlock("leyline_crystal_block",
            new crystal_block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TEAL)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block BUDDING_LEYLINE_CRYSTAL =registerBlock("budding_leyline_crystal",
            new budding_crystal_block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TEAL)
                    .strength(1.5f)
                    .ticksRandomly()
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ANCIENT_PEDESTAL =registerBlock("ancient_pedestal",
            new AncientPedestalBlock(AbstractBlock.Settings.create()
                    .strength(1f)
                    .requiresTool()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block KILN_BLOCK =registerBlock("kiln_block",
            new AncientPedestalBlock(AbstractBlock.Settings.create()
                    .strength(1f)
                    .requiresTool()
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILVER_BLOCK =registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_SILVER_BLOCK =registerBlock("raw_silver_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE_GRAY)
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILVER_ORE =registerBlock("silver_ore",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_SILVER_ORE =registerBlock("silver_ore_deepslate",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    //trees and leaves
    public static final Block ASH_WOOD =registerBlock("ash_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block ASH_LOG =registerBlock("ash_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block ASH_LEAVES =registerBlock("ash_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block ASH_SAPLING =registerBlock("ash_sapling",
            new SaplingBlock(ModSaplingGenerators.ASH, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block ASH_PLANKS = registerBlock("ash_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block HAZEL_WOOD =registerBlock("hazel_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block HAZEL_LOG =registerBlock("hazel_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block HAZEL_LEAVES =registerBlock("hazel_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block HAZEL_SAPLING =registerBlock("hazel_sapling",
            new SaplingBlock(ModSaplingGenerators.HAZEL, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block HAZEL_PLANKS = registerBlock("hazel_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block HOLLY_WOOD =registerBlock("holly_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block HOLLY_LOG =registerBlock("holly_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block HOLLY_LEAVES =registerBlock("holly_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block HOLLY_SAPLING =registerBlock("holly_sapling",
            new SaplingBlock(ModSaplingGenerators.HOLLY, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block HOLLY_PLANKS = registerBlock("holly_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));

    public static final Block YEW_WOOD =registerBlock("yew_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final Block YEW_LOG =registerBlock("yew_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(3f)));
    public static final Block YEW_LEAVES =registerBlock("yew_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block YEW_SAPLING =registerBlock("yew_sapling",
            new SaplingBlock(ModSaplingGenerators.YEW, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block YEW_PLANKS = registerBlock("yew_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(3f)));
//


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ProjectiveMagistry.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ProjectiveMagistry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ProjectiveMagistry.LOGGER.info("Registering Mod Blocks For " + ProjectiveMagistry.MOD_ID);
    }

    //datagen shit

}
