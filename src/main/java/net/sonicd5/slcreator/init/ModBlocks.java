package net.sonicd5.slcreator.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sonicd5.slcreator.SilentCreator;

public class ModBlocks {

    private static Block register(String path, Block block) {
        ModItems.register(path, new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, Identifier.of(SilentCreator.MOD_ID, path), block);
    }

    public static void initialize() {
        SilentCreator.LOGGER.info("Registering Blocks");
    }
}
