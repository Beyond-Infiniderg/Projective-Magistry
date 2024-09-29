package derg.projectivemagistry.common.item;

import derg.projectivemagistry.ProjectiveMagistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(ProjectiveMagistry.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static final Item SUSPICIOUS_SUBSTANCE = register(
            new Item(new Item.Settings()), "suspicious_substance"
    );
    public static final Item ICY_NEEDLE = register(
            new Item(new Item.Settings()), "icy_needle"
    );
    public static final Item RAW_SILVER = register(
            new Item(new Item.Settings()), "raw_silver"
    );
    public static final Item SILVER_INGOT = register(
            new Item(new Item.Settings()), "silver_ingot"
    );
    public static final Item SILVER_NUGGET = register(
            new Item(new Item.Settings()), "silver_nugget"
    );
    public static final Item SILVER_SWORD = register(
            new Item(new Item.Settings()), "silver_sword"
    );
    public static final Item ATHAME = register(
            new Item(new Item.Settings()), "athame"
    );
    public static final Item BLOOD_VIAL = register(
            new Item(new Item.Settings()), "blood_vial"
    );
    public static final Item DOG_TONGUE = register(
            new Item(new Item.Settings()), "dog_tongue"
    );
    public static final Item DEMON_HEART = register(
            new Item(new Item.Settings()), "demon_heart"
    );
    public static final Item CHALK = register(
            new Item(new Item.Settings()), "chalk_normal"
    );
    public static final Item CHALK_E = register(
            new Item(new Item.Settings()), "chalk_ender"
    );
    public static final Item CHALK_G = register(
            new Item(new Item.Settings()), "chalk_golden"
    );
    public static final Item CHALK_N = register(
            new Item(new Item.Settings()), "chalk_nether"
    );
    public static final Item CHALK_R = register(
            new Item(new Item.Settings()), "chalk_remnant"
    );
    public static final Item LEYLINE_CRYSTAL = register(
            new Item(new Item.Settings()), "leyline_crystal"
    );
    public static void initialize() {
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_SILVER);
            entries.add(SILVER_INGOT);
            entries.add(SILVER_NUGGET);

                });
    }
}