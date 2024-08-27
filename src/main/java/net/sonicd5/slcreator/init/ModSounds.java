package net.sonicd5.slcreator.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.sonicd5.slcreator.SLCreator;

public class ModSounds {

    protected static SoundEvent register(String path) {
        Identifier id = Identifier.of(SLCreator.MOD_ID, path);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void initialize() {
        SLCreator.LOGGER.info("Registering Sounds");
    }
}
