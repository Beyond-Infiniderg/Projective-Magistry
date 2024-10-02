package derg.projectivemagistry.common.registry;


import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.recipe.KilnCookingRecipe;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProjectiveMagistryRecipeTypes {
    private static final Map<RecipeSerializer<?>, Identifier> RECIPE_SERIALIZERS = new LinkedHashMap<>();
    private static final Map<RecipeType<?>, Identifier> RECIPE_TYPES = new LinkedHashMap<>();

    //public static final RecipeSerializer<KilnCookingRecipe> KILN_COOKING_RECIPE_SERIALIZER = create("kiln_cooking", new KilnCookingRecipe.Serializer);
    public static final RecipeType<KilnCookingRecipe> KILN_COOKING_RECIPE_TYPE = create("kiln_cooking");


    private static <T extends Recipe<?>> RecipeSerializer<T> create(String name, RecipeSerializer<T> serializer) {
        RECIPE_SERIALIZERS.put(serializer, ProjectiveMagistry.id(name));
        return serializer;
    }

    private static <T extends Recipe<?>> RecipeType<T> create(String name) {
        RecipeType<T> type = new RecipeType<>() {
            @Override
            public String toString() {
                return name;
            }
        };
        RECIPE_TYPES.put(type, ProjectiveMagistry.id(name));
        return type;
    }

    public static void init() {
        RECIPE_SERIALIZERS.keySet().forEach(recipeSerializer -> Registry.register(Registries.RECIPE_SERIALIZER, RECIPE_SERIALIZERS.get(recipeSerializer), recipeSerializer));
        RECIPE_TYPES.keySet().forEach(recipeType -> Registry.register(Registries.RECIPE_TYPE, RECIPE_TYPES.get(recipeType), recipeType));
    }
}

