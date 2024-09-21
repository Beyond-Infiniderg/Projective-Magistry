package derg.projectivemagistry.common.registry;

import derg.projectivemagistry.ProjectiveMagistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LEYLINE_CRYSTAL_BLOCK =registerBlock("leyline_crystal_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TEAL)
                    .strength(1.5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block BUDDING_LEYLINE_CRYSTAL =registerBlock("budding_leyline_crystal",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TEAL)
                    .strength(1.5f)
                    .ticksRandomly()
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));


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
