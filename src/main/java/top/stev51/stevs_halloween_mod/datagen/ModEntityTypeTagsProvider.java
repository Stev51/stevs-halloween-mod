package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.ModEntities;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagsProvider extends EntityTypeTagsProvider {

    public ModEntityTypeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, HalloweenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(EntityTypeTags.FALL_DAMAGE_IMMUNE)
                .add(ModEntities.GHOST.get());

        tag(EntityTypeTags.FREEZE_HURTS_EXTRA_TYPES)
                .add(ModEntities.DEVIL.get());

        tag(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS)
                .add(ModEntities.GHOST.get());

        tag(EntityTypeTags.UNDEAD)
                .add(ModEntities.GHOST.get())
                .add(ModEntities.VAMPIRE.get())
                .add(ModEntities.FRANKENSTEIN.get())
                .add(ModEntities.MUMMY.get());

    }

}
