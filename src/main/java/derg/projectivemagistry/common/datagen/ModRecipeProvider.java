package derg.projectivemagistry.common.datagen;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;



import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_STAIRS,6)

                .pattern("  b")
                .pattern(" bb")
                .pattern("bbb")
                .input('b', ModBlocks.ASH_PLANKS)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_STAIRS,6)

                .pattern("  b")
                .pattern(" bb")
                .pattern("bbb")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_STAIRS,6)

                .pattern("  b")
                .pattern(" bb")
                .pattern("bbb")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "holly_stairs"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_STAIRS,6)

                .pattern("  b")
                .pattern(" bb")
                .pattern("bbb")
                .input('b', ModBlocks.YEW_PLANKS)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "yew_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_SLAB,6)

                .pattern("   ")
                .pattern("   ")
                .pattern("bbb")
                .input('b', ModBlocks.ASH_PLANKS)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_slabs"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_SLAB,6)

                .pattern("   ")
                .pattern("   ")
                .pattern("bbb")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_stairs"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_SLAB,6)

                .pattern("   ")
                .pattern("   ")
                .pattern("bbb")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "holly_slabs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_SLAB,6)

                .pattern("   ")
                .pattern("   ")
                .pattern("bbb")
                .input('b', ModBlocks.YEW_PLANKS)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "yew_slabs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_DOOR,3)

                .pattern("bb ")
                .pattern("bb ")
                .pattern("bb ")
                .input('b', ModBlocks.ASH_PLANKS)

                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_TRAPDOOR,2)

                .pattern("   ")
                .pattern("bbb")
                .pattern("bbb")
                .input('b', ModBlocks.ASH_PLANKS)


                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_trapdoor"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_FENCE,3)

                .pattern("   ")
                .pattern("bsb")
                .pattern("bsb")
                .input('b', ModBlocks.ASH_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_fence"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_FENCE_GATE,3)

                .pattern("   ")
                .pattern("sbs")
                .pattern("sbs")
                .input('b', ModBlocks.ASH_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_fence_gate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_PRESSURE_PLATE)

                .pattern("   ")
                .pattern(" bb")
                .pattern("   ")
                .input('b', ModBlocks.ASH_PLANKS)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter,Identifier.of(ProjectiveMagistry.MOD_ID, "ash_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_DOOR, 3)
                .pattern("bb ")
                .pattern("bb ")
                .pattern("bb ")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_TRAPDOOR, 2)
                .pattern("   ")
                .pattern("bbb")
                .pattern("bbb")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_FENCE, 3)
                .pattern("   ")
                .pattern("bsb")
                .pattern("bsb")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_FENCE_GATE, 3)
                .pattern("   ")
                .pattern("sbs")
                .pattern("sbs")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_PRESSURE_PLATE)
                .pattern("   ")
                .pattern(" bb")
                .pattern("   ")
                .input('b', ModBlocks.HAZEL_PLANKS)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "hazel_pressure_plate"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_DOOR, 3)
                .pattern("bb ")
                .pattern("bb ")
                .pattern("bb ")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "holly_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_TRAPDOOR, 2)
                .pattern("   ")
                .pattern("bbb")
                .pattern("bbb")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "holly_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_FENCE, 3)
                .pattern("   ")
                .pattern("bsb")
                .pattern("bsb")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "holly_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_FENCE_GATE, 3)
                .pattern("   ")
                .pattern("sbs")
                .pattern("sbs")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "holly_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_PRESSURE_PLATE)
                .pattern("   ")
                .pattern(" bb")
                .pattern("   ")
                .input('b', ModBlocks.HOLLY_PLANKS)
                .criterion(hasItem(ModBlocks.HOLLY_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "holly_pressure_plate"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_DOOR, 3)
                .pattern("bb ")
                .pattern("bb ")
                .pattern("bb ")
                .input('b', ModBlocks.YEW_PLANKS)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "yew_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_TRAPDOOR, 2)
                .pattern("   ")
                .pattern("bbb")
                .pattern("bbb")
                .input('b', ModBlocks.YEW_PLANKS)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "yew_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_FENCE, 3)
                .pattern("   ")
                .pattern("bsb")
                .pattern("bsb")
                .input('b', ModBlocks.YEW_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "yew_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_FENCE_GATE, 3)
                .pattern("   ")
                .pattern("sbs")
                .pattern("sbs")
                .input('b', ModBlocks.YEW_PLANKS)
                .input('s', Items.STICK)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "yew_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_PRESSURE_PLATE)
                .pattern("   ")
                .pattern(" bb")
                .pattern("   ")
                .input('b', ModBlocks.YEW_PLANKS)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter, Identifier.of(ProjectiveMagistry.MOD_ID, "yew_pressure_plate"));



        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_PLANKS,4)
                .input(ModBlocks.ASH_LOG)
                .criterion(hasItem(ModBlocks.ASH_LOG), conditionsFromItem(ModBlocks.ASH_LOG))

                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_PLANKS,4)
                .input(ModBlocks.HAZEL_LOG)
                .criterion(hasItem(ModBlocks.HAZEL_LOG), conditionsFromItem(ModBlocks.HAZEL_LOG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_PLANKS,4)
                .input(ModBlocks.HOLLY_LOG)
                .criterion(hasItem(ModBlocks.HOLLY_LOG), conditionsFromItem(ModBlocks.HOLLY_LOG))

                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_PLANKS,4)
                .input(ModBlocks.YEW_LOG)
                .criterion(hasItem(ModBlocks.YEW_LOG), conditionsFromItem(ModBlocks.YEW_LOG))

                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASH_BUTTON,1)
                .input(ModBlocks.ASH_PLANKS)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.ASH_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_BUTTON,1)
                .input(ModBlocks.HAZEL_PLANKS)
                .criterion(hasItem(ModBlocks.HAZEL_PLANKS), conditionsFromItem(ModBlocks.HAZEL_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HOLLY_BUTTON,1)
                .input(ModBlocks.HOLLY_PLANKS)
                .criterion(hasItem(ModBlocks.ASH_PLANKS), conditionsFromItem(ModBlocks.HOLLY_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_BUTTON,1)
                .input(ModBlocks.YEW_PLANKS)
                .criterion(hasItem(ModBlocks.YEW_PLANKS), conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);
    }
}
