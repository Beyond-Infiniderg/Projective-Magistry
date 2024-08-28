package Items;

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
    public static void initialize() {
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUSPICIOUS_SUBSTANCE);
            entries.add(ICY_NEEDLE);
                });
    }
}