package derg.projectivemagistry.common.item;
import derg.projectivemagistry.common.item.ModTags;  // Correct package path

import derg.projectivemagistry.ProjectiveMagistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final  TagKey<Block> NEED_SILVER_TOOL = createTag("needs_silver_tool");
        public static final  TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ProjectiveMagistry.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ProjectiveMagistry.MOD_ID, name));
        }
    }
}
