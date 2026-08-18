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



        add(ModSoundEvents.PICK_APPLES, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:item/apple/pick1"),
                        sound("stevs_halloween_mod:item/apple/pick2")
                )
                .subtitle("subtitles.stevs_halloween_mod.item.apple.pick")
        );



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



        add(ModSoundEvents.FRANKENSTEIN_AMBIENT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/frankenstein/say1"),
                        sound("stevs_halloween_mod:mob/frankenstein/say2"),
                        sound("stevs_halloween_mod:mob/frankenstein/say3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.frankenstein.ambient")
        );

        add(ModSoundEvents.FRANKENSTEIN_HURT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/frankenstein/hurt1"),
                        sound("stevs_halloween_mod:mob/frankenstein/hurt2")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.frankenstein.hurt")
        );

        add(ModSoundEvents.FRANKENSTEIN_DEATH, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/frankenstein/death")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.frankenstein.death")
        );



        add(ModSoundEvents.GHOST_AMBIENT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/ghost/idle1"),
                        sound("stevs_halloween_mod:mob/ghost/idle2"),
                        sound("stevs_halloween_mod:mob/ghost/idle3"),
                        sound("stevs_halloween_mod:mob/ghost/idle4"),
                        sound("stevs_halloween_mod:mob/ghost/idle5")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.ghost.ambient")
        );

        add(ModSoundEvents.GHOST_HURT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/ghost/hurt1"),
                        sound("stevs_halloween_mod:mob/ghost/hurt2"),
                        sound("stevs_halloween_mod:mob/ghost/hurt3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.ghost.hurt")
        );

        add(ModSoundEvents.GHOST_DEATH, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/ghost/death1"),
                        sound("stevs_halloween_mod:mob/ghost/death2"),
                        sound("stevs_halloween_mod:mob/ghost/death3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.ghost.death")
        );



        add(ModSoundEvents.MUMMY_AMBIENT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/mummy/idle1"),
                        sound("stevs_halloween_mod:mob/mummy/idle2"),
                        sound("stevs_halloween_mod:mob/mummy/idle3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.mummy.ambient")
        );

        add(ModSoundEvents.MUMMY_HURT, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/mummy/hurt1"),
                        sound("stevs_halloween_mod:mob/mummy/hurt2")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.mummy.hurt")
        );

        add(ModSoundEvents.MUMMY_DEATH, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/mummy/death1"),
                        sound("stevs_halloween_mod:mob/mummy/death2")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.mummy.death")
        );



        add(ModSoundEvents.VAMPIRE_HISS, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/vampire/hiss1"),
                        sound("stevs_halloween_mod:mob/vampire/hiss2"),
                        sound("stevs_halloween_mod:mob/vampire/hiss3")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.vampire.hiss")
        );

        add(ModSoundEvents.VAMPIRE_DEATH, SoundDefinition.definition()
                .with(
                        sound("stevs_halloween_mod:mob/vampire/death")
                )
                .subtitle("subtitles.stevs_halloween_mod.entity.vampire.death")
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
