package net.sonicd5.slcreator.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sonicd5.slcreator.SilentCreator;

public class ModItemGroups {

    public static ItemGroup ROOT = register("root",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.slcreator.root"))
                    .icon(() -> new ItemStack(ModItems.EXAMPLE)).entries(
                            (displayContext, entries) -> {

                            }
                    ).build());

    private static ItemGroup register(String path, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP,
                Identifier.of(SilentCreator.MOD_ID, path), itemGroup);
    }
    public static void initialize() {
        SilentCreator.LOGGER.info("Registering Item Groups");
    }
}
