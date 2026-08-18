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



    public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_HOWL = SOUND_EVENTS.register(
            "entity.werewolf.howl",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "werewolf_howl"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_HURT = SOUND_EVENTS.register(
            "entity.werewolf.growl",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "werewolf_growl"))
    );

    public static final DeferredHolder<SoundEvent, SoundEvent> WEREWOLF_DEATH = SOUND_EVENTS.register(
            "entity.werewolf.death",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "werewolf_death"))
    );



    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

}
