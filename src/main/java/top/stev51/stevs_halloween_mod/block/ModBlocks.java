package top.stev51.stevs_halloween_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.custom.AppleLeavesBlock;
import top.stev51.stevs_halloween_mod.item.ModItems;
import top.stev51.stevs_halloween_mod.worldgen.tree.ModTreeGrowers;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HalloweenMod.MOD_ID);



    public static final DeferredBlock<Block> APPLE_LEAVES = registerBlock("apple_leaves",
            () -> new AppleLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))
    );

    public static final DeferredBlock<Block> APPLE_SAPLING = registerBlock("apple_sapling",
            () -> new SaplingBlock(ModTreeGrowers.APPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    );



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}
