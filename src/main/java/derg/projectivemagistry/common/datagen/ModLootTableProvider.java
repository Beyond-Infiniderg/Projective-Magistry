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


    }

}
