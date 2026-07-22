package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HalloweenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.LEAVES)
                .add(ModBlocks.APPLE_LEAVES.get());

        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.APPLE_LEAVES.get());

        tag(BlockTags.SAPLINGS)
                .add(ModBlocks.APPLE_SAPLING.get());

        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_APPLE_SAPLING.get());

    }

}
