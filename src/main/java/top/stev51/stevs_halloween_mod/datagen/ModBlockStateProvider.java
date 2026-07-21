package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HalloweenMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        leavesBlock(ModBlocks.APPLE_LEAVES);
        saplingBlock(ModBlocks.APPLE_SAPLING);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("testmod:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("testmod:block/" + deferredBlock.getId().getPath() + appendix));
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(
                BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                blockTexture(blockRegistryObject.get())
        ).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().singleTexture(
                BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                ResourceLocation.parse("minecraft:block/leaves"),
                "all",
                blockTexture(blockRegistryObject.get())
        ).renderType("cutout"));
    }

}
