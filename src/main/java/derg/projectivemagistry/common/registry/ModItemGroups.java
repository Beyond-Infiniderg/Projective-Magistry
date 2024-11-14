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
import net.minecraft.util.Identifier;//86

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

                        entries.add(ModItems.PENIS_EEK_MUSIC_DISK);

                        entries.add(ModBlocks.LEYLINE_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                        entries.add(ModBlocks.HAZEL_WOOD);
                        entries.add(ModBlocks.HAZEL_LEAVES);
                        entries.add(ModBlocks.HAZEL_SAPLING);
                        entries.add(ModBlocks.HAZEL_PLANKS);
                        entries.add(ModBlocks.HAZEL_LOG);
                        entries.add(ModBlocks.ASH_WOOD);
                        entries.add(ModBlocks.ASH_LEAVES);
                        entries.add(ModBlocks.ASH_SAPLING);
                        entries.add(ModBlocks.ASH_PLANKS);
                        entries.add(ModBlocks.ASH_LOG);
                        entries.add(ModBlocks.HOLLY_WOOD);
                        entries.add(ModBlocks.HOLLY_LEAVES);
                        entries.add(ModBlocks.HOLLY_SAPLING);
                        entries.add(ModBlocks.HOLLY_PLANKS);
                        entries.add(ModBlocks.HOLLY_LOG);
                        entries.add(ModBlocks.YEW_WOOD);
                        entries.add(ModBlocks.YEW_LEAVES);
                        entries.add(ModBlocks.YEW_SAPLING);
                        entries.add(ModBlocks.YEW_PLANKS);
                        entries.add(ModBlocks.YEW_LOG);

                        entries.add(ModBlocks.ASH_SLAB);
                        entries.add(ModBlocks.ASH_STAIRS);
                        entries.add(ModBlocks.ASH_FENCE);
                        entries.add(ModBlocks.ASH_FENCE_GATE);
                        entries.add(ModBlocks.ASH_BUTTON);
                        entries.add(ModBlocks.ASH_WALL);
                        entries.add(ModBlocks.ASH_PRESSURE_PLATE);
                        entries.add(ModBlocks.ASH_DOOR);
                        entries.add(ModBlocks.ASH_TRAPDOOR);
                        entries.add(ModBlocks.HAZEL_SLAB);
                        entries.add(ModBlocks.HAZEL_STAIRS);
                        entries.add(ModBlocks.HAZEL_FENCE);
                        entries.add(ModBlocks.HAZEL_FENCE_GATE);
                        entries.add(ModBlocks.HAZEL_WALL);
                        entries.add(ModBlocks.HAZEL_BUTTON);
                        entries.add(ModBlocks.HAZEL_PRESSURE_PLATE);
                        entries.add(ModBlocks.HAZEL_DOOR);
                        entries.add(ModBlocks.HAZEL_TRAPDOOR);

                        entries.add(ModBlocks.HOLLY_SLAB);
                        entries.add(ModBlocks.HOLLY_STAIRS);
                        entries.add(ModBlocks.HOLLY_FENCE);
                        entries.add(ModBlocks.HOLLY_FENCE_GATE);
                        entries.add(ModBlocks.HOLLY_WALL);
                        entries.add(ModBlocks.HOLLY_BUTTON);
                        entries.add(ModBlocks.HOLLY_PRESSURE_PLATE);
                        entries.add(ModBlocks.HOLLY_DOOR);
                        entries.add(ModBlocks.HOLLY_TRAPDOOR);

                        entries.add(ModBlocks.YEW_SLAB);
                        entries.add(ModBlocks.YEW_STAIRS);
                        entries.add(ModBlocks.YEW_FENCE);
                        entries.add(ModBlocks.YEW_FENCE_GATE);
                        entries.add(ModBlocks.YEW_WALL);
                        entries.add(ModBlocks.YEW_BUTTON);
                        entries.add(ModBlocks.YEW_PRESSURE_PLATE);
                        entries.add(ModBlocks.YEW_DOOR);
                        entries.add(ModBlocks.YEW_TRAPDOOR);
                        entries.add(ModBlocks.ANCIENT_PEDESTAL);


                    }).build());

    public static void registerItemGroups(){
        ProjectiveMagistry.LOGGER.info("Registering Item Groups For" + ProjectiveMagistry.MOD_ID);
    }
}
