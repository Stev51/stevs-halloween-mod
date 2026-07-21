package top.stev51.stevs_halloween_mod.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.custom.*;

import java.util.function.Supplier;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, HalloweenMod.MOD_ID);



    public static final Supplier<EntityType<GhostEntity>> GHOST = ENTITY_TYPES.register("ghost",
            () -> EntityType.Builder.of(GhostEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f)
                    .build("ghost")
    );

    public static final Supplier<EntityType<VampireEntity>> VAMPIRE = ENTITY_TYPES.register("vampire",
            () -> EntityType.Builder.of(VampireEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f)
                    .build("vampire")
    );

    public static final Supplier<EntityType<WerewolfEntity>> WEREWOLF = ENTITY_TYPES.register("werewolf",
            () -> EntityType.Builder.of(WerewolfEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f)
                    .build("werewolf")
    );

    public static final Supplier<EntityType<FrankensteinEntity>> FRANKENSTEIN = ENTITY_TYPES.register("frankenstein",
            () -> EntityType.Builder.of(FrankensteinEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f)
                    .build("frankenstein")
    );

    public static final Supplier<EntityType<MummyEntity>> MUMMY = ENTITY_TYPES.register("mummy",
            () -> EntityType.Builder.of(MummyEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f)
                    .build("mummy")
    );

    public static final Supplier<EntityType<DevilEntity>> DEVIL = ENTITY_TYPES.register("devil",
            () -> EntityType.Builder.of(DevilEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f)
                    .build("devil")
    );



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
