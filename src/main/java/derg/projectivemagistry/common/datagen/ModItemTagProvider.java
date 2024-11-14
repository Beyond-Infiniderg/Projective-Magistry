package derg.projectivemagistry.common.datagen;

import derg.projectivemagistry.common.block.ModBlocks;
import derg.projectivemagistry.common.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider  extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output,completableFuture);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.SILVER_SWORD);
    }

  @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


       getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
               .add(ModBlocks.ASH_LOG.asItem(), ModBlocks.ASH_WOOD.asItem(), ModBlocks.HAZEL_LOG.asItem()
                       ,ModBlocks.HAZEL_LOG.asItem(),ModBlocks.HOLLY_LOG.asItem(),ModBlocks.HOLLY_WOOD.asItem(),
                       ModBlocks.YEW_LOG.asItem(),ModBlocks.YEW_WOOD.asItem());
       getOrCreateTagBuilder(ItemTags.PLANKS)
               .add(ModBlocks.ASH_PLANKS.asItem(),ModBlocks.HOLLY_PLANKS.asItem(),ModBlocks.HAZEL_PLANKS.asItem(),ModBlocks.YEW_PLANKS.asItem());



  }
}
