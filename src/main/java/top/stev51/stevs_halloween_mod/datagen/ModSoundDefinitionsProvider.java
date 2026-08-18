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



        add(ModSoundEvents.DEVIL_AMBIENT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/devil/idle1"),
                        sound("stevs_halloween_mod:mob/devil/idle2"),
                        sound("stevs_halloween_mod:mob/devil/idle3"),
                        sound("stevs_halloween_mod:mob/devil/idle4")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.devil.ambient")
        );

        add(ModSoundEvents.DEVIL_HURT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/devil/hurt1"),
                        sound("stevs_halloween_mod:mob/devil/hurt2"),
                        sound("stevs_halloween_mod:mob/devil/hurt3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.devil.hurt")
        );

        add(ModSoundEvents.DEVIL_DEATH, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/devil/death1"),
                        sound("stevs_halloween_mod:mob/devil/death2")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.devil.death")
        );



        add(ModSoundEvents.WEREWOLF_HOWL, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/werewolf/howl1")
                                .volume(0.5f),
                        sound("stevs_halloween_mod:mob/werewolf/howl2")
                                .volume(0.5f)
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.werewolf.howl")
        );

        add(ModSoundEvents.WEREWOLF_HURT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/werewolf/growl1"),
                        sound("stevs_halloween_mod:mob/werewolf/growl2"),
                        sound("stevs_halloween_mod:mob/werewolf/growl3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.werewolf.hurt")
        );

        add(ModSoundEvents.WEREWOLF_DEATH, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/werewolf/death")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.werewolf.death")
        );



    }

}
