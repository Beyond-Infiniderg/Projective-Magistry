package derg.projectivemagistry.common.block;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.crystal.budding_crystal_block;
import derg.projectivemagistry.common.block.crystal.crystal_block;
import derg.projectivemagistry.common.block.entity.Pedestal.AncientPedestalBlock;
import derg.projectivemagistry.common.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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

   public static final Block ASH_STAIRS =registerBlock("ash_stairs",
            new StairsBlock(ModBlocks.ASH_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f)));
    public static final Block ASH_SLAB =registerBlock("ash_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block ASH_FENCE =registerBlock("ash_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));
    public static final Block ASH_FENCE_GATE =registerBlock("ash_fence_gate",
            new FenceGateBlock(WoodType.OAK,AbstractBlock.Settings.create().strength(2f)));


    public static final Block ASH_WALL =registerBlock("ash_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block ASH_BUTTON =registerBlock("ash_button",
            new ButtonBlock(BlockSetType.OAK,15,AbstractBlock.Settings.create()));

//
    public static final Block ASH_PRESSURE_PLATE =registerBlock("ash_pressure_plate",
        new PressurePlateBlock(BlockSetType.OAK,AbstractBlock.Settings.create()));


    public static final Block ASH_TRAPDOOR =registerBlock("ash_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));



    public static final Block ASH_DOOR =registerBlock("ash_door",
    new DoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));




    public static final Block HAZEL_STAIRS =registerBlock("hazel_stairs",
            new StairsBlock(ModBlocks.HAZEL_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f)));
    public static final Block HAZEL_SLAB =registerBlock("hazel_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block HAZEL_FENCE =registerBlock("hazel_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block HAZEL_FENCE_GATE =registerBlock("hazel_fence_gate",
            new FenceGateBlock(WoodType.OAK,AbstractBlock.Settings.create().strength(2f)));

    public static final Block HAZEL_WALL =registerBlock("hazel_wall",
             new WallBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block HAZEL_BUTTON =registerBlock("hazel_button",
            new ButtonBlock(BlockSetType.OAK,15,AbstractBlock.Settings.create()));


    public static final Block HAZEL_PRESSURE_PLATE =registerBlock("hazel_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,AbstractBlock.Settings.create()));


    public static final Block HAZEL_TRAPDOOR =registerBlock("hazel_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));


    public static final Block HAZEL_DOOR =registerBlock("hazel_door",
            new DoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));



    public static final Block HOLLY_STAIRS =registerBlock("holly_stairs",
            new StairsBlock(ModBlocks.HOLLY_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f)));
    public static final Block HOLLY_SLAB =registerBlock("holly_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block HOLLY_FENCE =registerBlock("holly_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block HOLLY_FENCE_GATE =registerBlock("holly_fence_gate",
            new FenceGateBlock(WoodType.OAK,AbstractBlock.Settings.create().strength(2f)));


    public static final Block HOLLY_WALL =registerBlock("holly_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block HOLLY_BUTTON =registerBlock("holly_button",
            new ButtonBlock(BlockSetType.OAK,15,AbstractBlock.Settings.create()));


    public static final Block HOLLY_PRESSURE_PLATE =registerBlock("holly_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,AbstractBlock.Settings.create()));

//
    public static final Block HOLLY_TRAPDOOR =registerBlock("holly_trapdoor",
        new TrapdoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));


    public static final Block HOLLY_DOOR =registerBlock("holly_door",
            new DoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));



    public static final Block YEW_STAIRS =registerBlock("yew_stairs",
            new StairsBlock(ModBlocks.YEW_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f)));

    public static final Block YEW_SLAB =registerBlock("yew_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f)));


    public static final Block YEW_FENCE =registerBlock("yew_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block YEW_FENCE_GATE =registerBlock("yew_fence_gate",
            new FenceGateBlock(WoodType.OAK,AbstractBlock.Settings.create().strength(2f)));


    public static final Block YEW_WALL =registerBlock("yew_wall",
             new WallBlock(AbstractBlock.Settings.create().strength(2f)));

    public static final Block YEW_BUTTON =registerBlock("yew_button",
            new ButtonBlock(BlockSetType.OAK,15,AbstractBlock.Settings.create()));


    public static final Block YEW_PRESSURE_PLATE =registerBlock("yew_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,AbstractBlock.Settings.create()));

    public static final Block YEW_TRAPDOOR =registerBlock("yew_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));

    public static final Block YEW_DOOR =registerBlock("yew_door",
            new DoorBlock(BlockSetType.OAK,AbstractBlock.Settings.create().nonOpaque()));


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


    public static void initialize() {


        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ASH_SAPLING,0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.HOLLY_SAPLING,0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.HAZEL_SAPLING,0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.YEW_SAPLING,0.3f);

        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.ASH_LEAVES,0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.HOLLY_LEAVES,0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.HAZEL_LEAVES,0.3f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.YEW_LEAVES,0.3f);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ASH_LOG);
            entries.add(HOLLY_LOG);
            entries.add(HAZEL_LOG);
            entries.add(YEW_LOG);
            entries.add(ASH_WOOD);
            entries.add(HAZEL_WOOD);
            entries.add(HOLLY_WOOD);
            entries.add(YEW_WOOD);
            entries.add(ASH_PLANKS);
            entries.add(HAZEL_PLANKS);
            entries.add(HOLLY_PLANKS);
            entries.add(YEW_PLANKS);
            entries.add(ASH_STAIRS);
            entries.add(HAZEL_STAIRS);
            entries.add(HOLLY_STAIRS);
            entries.add(YEW_STAIRS);
            entries.add(ASH_SLAB);
            entries.add(HAZEL_SLAB);
            entries.add(HOLLY_SLAB);
            entries.add(YEW_SLAB);
            entries.add(ASH_FENCE);
            entries.add(HAZEL_FENCE);
            entries.add(HOLLY_FENCE);
            entries.add(YEW_FENCE);
            entries.add(ASH_FENCE_GATE);
            entries.add(HAZEL_FENCE_GATE);
            entries.add(HOLLY_FENCE_GATE);
            entries.add(YEW_FENCE_GATE);
            entries.add(ASH_DOOR);
            entries.add(HAZEL_DOOR);
            entries.add(HOLLY_DOOR);
            entries.add(YEW_DOOR);
            entries.add(ASH_TRAPDOOR);
            entries.add(HAZEL_TRAPDOOR);
            entries.add(HOLLY_TRAPDOOR);
            entries.add(YEW_TRAPDOOR);
            entries.add(ASH_BUTTON);
            entries.add(HAZEL_BUTTON);
            entries.add(HOLLY_BUTTON);
            entries.add(YEW_BUTTON);
            entries.add(ASH_PRESSURE_PLATE);
            entries.add(HAZEL_PRESSURE_PLATE);
            entries.add(HOLLY_PRESSURE_PLATE);
            entries.add(YEW_PRESSURE_PLATE);
            entries.add(ASH_WALL);
            entries.add(HAZEL_WALL);
            entries.add(HOLLY_WALL);
            entries.add(YEW_WALL);



        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ASH_LOG);
            entries.add(HAZEL_LOG);
            entries.add(HOLLY_LOG);
            entries.add(YEW_LOG);

            entries.add(ASH_SAPLING);
            entries.add(HAZEL_SAPLING);
            entries.add(HOLLY_SAPLING);
            entries.add(YEW_SAPLING);

            entries.add(ASH_LEAVES);
            entries.add(HAZEL_LEAVES);
            entries.add(HOLLY_LEAVES);
            entries.add(YEW_LEAVES);
            entries.add(SILVER_ORE);
            entries.add(DEEPSLATE_SILVER_ORE);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(KILN_BLOCK);
            entries.add(ANCIENT_PEDESTAL);
        });


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
        entries.add(ASH_BUTTON);
        entries.add(HAZEL_BUTTON);
        entries.add(HOLLY_BUTTON);
        entries.add(YEW_BUTTON);
        entries.add(ASH_PRESSURE_PLATE);
        entries.add(HAZEL_PRESSURE_PLATE);
        entries.add(HOLLY_PRESSURE_PLATE);
        entries.add(YEW_PRESSURE_PLATE);
        });
}
}
