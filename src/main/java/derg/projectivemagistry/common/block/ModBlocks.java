package derg.projectivemagistry.common.block;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.Kiln.kiln_block;
import derg.projectivemagistry.common.block.crystal.budding_crystal_block;
import derg.projectivemagistry.common.block.crystal.crystal_block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
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

    public static final Block KILN_BLOCK =registerBlock("kiln_block",
            new kiln_block(AbstractBlock.Settings.create()
                    .strength(1f)
                    .ticksRandomly()
                    .requiresTool()
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

    public static final Block HAZEL_WOOD =registerBlock("hazel_wood",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .strength(1f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block HAZEL_LEAVES =registerBlock("hazel_leaves",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block HAZEL_SAPLING =registerBlock( "hazel_sapling",
            new Block(AbstractBlock.Settings.create()
                    //map color ?
                    .strength(0f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)));

    public static final Block ASH_WOOD =registerBlock("ash_wood",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN)
                    .strength(1f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block ASH_LEAVES =registerBlock("ash_leaves",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block ASH_SAPLING =registerBlock( "ash_sapling",
            new Block(AbstractBlock.Settings.create()
                    //map color ?
                    .strength(0f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)));

    public static final Block HOLLY_WOOD =registerBlock("holly_wood",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(1f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block HOLLY_LEAVES =registerBlock("holly_leaves",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block HOLLY_SAPLING =registerBlock( "holly_sapling",
            new Block(AbstractBlock.Settings.create()
                    //map color ?
                    .strength(0f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)));

    public static final Block YEW_WOOD =registerBlock("yew_wood",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .strength(1f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block YEW_LEAVES =registerBlock("yew_leaves",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN)
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block YEW_SAPLING =registerBlock( "yew_sapling",
            new Block(AbstractBlock.Settings.create()
                    //map color ?
                    .strength(0f)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING)));


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
}
