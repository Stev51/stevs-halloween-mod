package top.stev51.stevs_halloween_mod.sound;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;

public class ModSoundEvents {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, HalloweenMod.MOD_ID);



    public static final DeferredHolder<SoundEvent, SoundEvent> DEVIL_AMBIENT = SOUND_EVENTS.register(
            "entity.devil.ambient",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "devil_ambient"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> DEVIL_HURT = SOUND_EVENTS.register(
            "entity.devil.hurt",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "devil_hurt"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> DEVIL_DEATH = SOUND_EVENTS.register(
            "entity.devil.death",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "devil_death"))
    );



    public static final DeferredHolder<SoundEvent, SoundEvent> FRANKENSTEIN_AMBIENT = SOUND_EVENTS.register(
            "entity.frankenstein.ambient",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "frankenstein_ambient"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> FRANKENSTEIN_HURT = SOUND_EVENTS.register(
            "entity.frankenstein.hurt",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "frankenstein_hurt"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> FRANKENSTEIN_DEATH = SOUND_EVENTS.register(
            "entity.frankenstein.death",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "frankenstein_death"))
    );



    public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_AMBIENT = SOUND_EVENTS.register(
            "entity.ghost.ambient",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "ghost_ambient"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_HURT = SOUND_EVENTS.register(
            "entity.ghost.hurt",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "ghost_hurt"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> GHOST_DEATH = SOUND_EVENTS.register(
            "entity.ghost.death",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "ghost_death"))
    );



    public static final DeferredHolder<SoundEvent, SoundEvent> MUMMY_AMBIENT = SOUND_EVENTS.register(
            "entity.mummy.ambient",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "mummy_ambient"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> MUMMY_HURT = SOUND_EVENTS.register(
            "entity.mummy.hurt",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "mummy_hurt"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> MUMMY_DEATH = SOUND_EVENTS.register(
            "entity.mummy.death",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "mummy_death"))
    );



    public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_HOWL = SOUND_EVENTS.register(
            "entity.werewolf.howl",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "werewolf_howl"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_HURT = SOUND_EVENTS.register(
            "entity.werewolf.hurt",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "werewolf_hurt"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_DEATH = SOUND_EVENTS.register(
            "entity.werewolf.death",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "werewolf_death"))
    );



    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
