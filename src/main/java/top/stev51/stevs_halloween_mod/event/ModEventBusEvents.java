package top.stev51.stevs_halloween_mod.event;

import net.minecraft.world.entity.SpawnPlacementType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.entity.custom.GhostEntity;
import top.stev51.stevs_halloween_mod.entity.custom.VampireEntity;

@EventBusSubscriber(modid=HalloweenMod.MOD_ID)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {

        event.put(ModEntities.GHOST.get(), GhostEntity.createAttributes().build());
        event.put(ModEntities.VAMPIRE.get(), VampireEntity.createAttributes().build());

    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {

        event.register(ModEntities.GHOST.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(ModEntities.VAMPIRE.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

    }

}
