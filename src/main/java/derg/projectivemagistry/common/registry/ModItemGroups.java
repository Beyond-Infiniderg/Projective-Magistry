package derg.projectivemagistry.common.registry;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.ModBlocks;
import derg.projectivemagistry.common.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PROJECTIVE_MAGISTRY_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ProjectiveMagistry.MOD_ID, "projective_magistry_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SUSPICIOUS_SUBSTANCE))
                    .displayName(Text.translatable("itemgroup.projectivemagistry.projective_magistry_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DEMON_HEART);
                        entries.add(ModItems.SUSPICIOUS_SUBSTANCE);
                        entries.add(ModItems.ICY_NEEDLE);
                        entries.add(ModItems.CHALK);
                        entries.add(ModItems.CHALK_E);
                        entries.add(ModItems.CHALK_G);
                        entries.add(ModItems.CHALK_N);
                        entries.add(ModItems.CHALK_R);
                        entries.add(ModItems.ATHAME);
                        entries.add(ModItems.BLOOD_VIAL);
                        entries.add(ModItems.DOG_TONGUE);
                        entries.add(ModItems.SILVER_SWORD);
                        entries.add(ModItems.LEYLINE_CRYSTAL);
                        entries.add(ModBlocks.LEYLINE_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                    }).build());

    public static void registerItemGroups(){
        ProjectiveMagistry.LOGGER.info("Registering Item Groups For" + ProjectiveMagistry.MOD_ID);
    }
}
