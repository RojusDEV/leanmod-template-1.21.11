package net.rojus.learn.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rojus.learn.LeanMod;

public class ModItems {
    public static final Item PINK_THING =
            registerItem("pink_thing", new Item(new Item.Settings()));

    public static final Item BROWN_THING =
            registerItem("brown_thing", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LeanMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LeanMod.LOGGER.info("Registerins mod items for " + LeanMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_THING);
        });
    }

}
