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
       //example of using datagen to have an block drop itself
        addDrop(ModBlocks.ASH_WOOD);
      //  addDrop(ModBlocks.ASH_LEAVES, leavesDrops(ModBlocks) );

    }
// for reference maybe for later idk
//    public LootTable.Builder leavesDrops(Block leaves, Block sapling, float... saplingChance) {
//        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
//        return this.dropsWithSilkTouchOrShears(
//                        leaves,
//                        ((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(sapling)))
//                                .conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), saplingChance))
//                )
//                .pool(
//                        LootPool.builder()
//                                .rolls(ConstantLootNumberProvider.create(1.0F))
//                                .conditionally(this.createWithoutShearsOrSilkTouchCondition())
//                                .with(
//                                        ((LeafEntry.Builder)this.applyExplosionDecay(
//                                                leaves, ItemEntry.builder(Items.STICK).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
//                                        ))
//                                                .conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), LEAVES_STICK_DROP_CHANCE))
//                                )
//                );
//        //
//    }
}
