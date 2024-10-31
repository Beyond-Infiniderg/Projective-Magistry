package derg.projectivemagistry.common.datagen;

import derg.projectivemagistry.common.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.ASH_LOG);
        addDrop(ModBlocks.ASH_WOOD);
        addDrop(ModBlocks.ASH_LEAVES, leavesDrops(ModBlocks.ASH_LEAVES,ModBlocks.ASH_SAPLING, 0.0625f));
        addDrop(ModBlocks.ASH_SAPLING);
        addDrop(ModBlocks.ASH_PLANKS);

        addDrop(ModBlocks.HOLLY_LOG);
        addDrop(ModBlocks.HOLLY_WOOD);
        addDrop(ModBlocks.HOLLY_LEAVES, leavesDrops(ModBlocks.HOLLY_LEAVES,ModBlocks.HOLLY_SAPLING, 0.0625f));
        addDrop(ModBlocks.HOLLY_SAPLING);
        addDrop(ModBlocks.HOLLY_PLANKS);

        addDrop(ModBlocks.HAZEL_LOG);
        addDrop(ModBlocks.HAZEL_WOOD);
        addDrop(ModBlocks.HAZEL_LEAVES, leavesDrops(ModBlocks.HAZEL_LEAVES,ModBlocks.HAZEL_SAPLING, 0.0625f));
        addDrop(ModBlocks.HAZEL_SAPLING);
        addDrop(ModBlocks.HAZEL_PLANKS);

        addDrop(ModBlocks.YEW_LOG);
        addDrop(ModBlocks.YEW_WOOD);
        addDrop(ModBlocks.YEW_LEAVES, leavesDrops(ModBlocks.YEW_LEAVES,ModBlocks.YEW_SAPLING, 0.0625f));
        addDrop(ModBlocks.YEW_SAPLING);
        addDrop(ModBlocks.YEW_PLANKS);

        addDrop(ModBlocks.ASH_SLAB);
        addDrop(ModBlocks.ASH_STAIRS);
        addDrop(ModBlocks.ASH_FENCE);
        addDrop(ModBlocks.ASH_FENCE_GATE);
        addDrop(ModBlocks.ASH_BUTTON);
        addDrop(ModBlocks.ASH_PRESSURE_PLATE);
        addDrop(ModBlocks.ASH_DOOR);
        addDrop(ModBlocks.ASH_TRAPDOOR);
        addDrop(ModBlocks.ASH_WALL);

        addDrop(ModBlocks.HAZEL_SLAB);
        addDrop(ModBlocks.HAZEL_STAIRS);
        addDrop(ModBlocks.HAZEL_FENCE);
        addDrop(ModBlocks.HAZEL_FENCE_GATE);
        addDrop(ModBlocks.HAZEL_BUTTON);
        addDrop(ModBlocks.HAZEL_PRESSURE_PLATE);
        addDrop(ModBlocks.HAZEL_DOOR);
        addDrop(ModBlocks.HAZEL_TRAPDOOR);
        addDrop(ModBlocks.HAZEL_WALL);

        addDrop(ModBlocks.HOLLY_SLAB);
        addDrop(ModBlocks.HOLLY_STAIRS);
        addDrop(ModBlocks.HOLLY_FENCE);
        addDrop(ModBlocks.HOLLY_FENCE_GATE);
        addDrop(ModBlocks.HOLLY_BUTTON);
        addDrop(ModBlocks.HOLLY_PRESSURE_PLATE);
        addDrop(ModBlocks.HOLLY_DOOR);
        addDrop(ModBlocks.HOLLY_TRAPDOOR);
        addDrop(ModBlocks.HOLLY_WALL);

        addDrop(ModBlocks.YEW_SLAB);
        addDrop(ModBlocks.YEW_STAIRS);
        addDrop(ModBlocks.YEW_FENCE);
        addDrop(ModBlocks.YEW_FENCE_GATE);
        addDrop(ModBlocks.YEW_BUTTON);
        addDrop(ModBlocks.YEW_PRESSURE_PLATE);
        addDrop(ModBlocks.YEW_DOOR);
        addDrop(ModBlocks.YEW_TRAPDOOR);
        addDrop(ModBlocks.YEW_WALL);


    }

}
