package net.sonicd5.slcreator.init;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sonicd5.slcreator.SLCreator;
import net.sonicd5.slcreator.entity.NpcEntity;

public class ModEntities {

    public static EntityType<NpcEntity> NPC = register(
            "npc",
            EntityType.Builder.create(NpcEntity::new, SpawnGroup.MISC).build());

    protected static <T extends Entity> EntityType<T> register(
            String path, EntityType<T> type) {
        return Registry.register(Registries.ENTITY_TYPE,
                Identifier.of(SLCreator.MOD_ID, path), type);
    }
    public static void initialize() {
        SLCreator.LOGGER.info("Registering Entities");
    }
}
