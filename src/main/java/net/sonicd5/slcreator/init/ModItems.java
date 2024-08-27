package net.sonicd5.slcreator.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sonicd5.slcreator.SilentCreator;

public class ModItems {

    public static final Item EXAMPLE = register("example",
            new Item(new Item.Settings()));


    protected static Item register(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SilentCreator.MOD_ID, path), item);
    }

    public static void initialize() {
        SilentCreator.LOGGER.info("Registering Items");
    }
}
