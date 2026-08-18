package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.sound.ModSoundEvents;

public class ModSoundDefinitionsProvider extends SoundDefinitionsProvider {

    protected ModSoundDefinitionsProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, HalloweenMod.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {

        add(ModSoundEvents.WEREWOLF_HOWL, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/werewolf/howl1")
                                .volume(0.5f),
                        sound("stevs_halloween_mod:mob/werewolf/howl2")
                                .volume(0.5f)
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.werewolf.howl")
        );

    }

}
