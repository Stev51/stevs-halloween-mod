package top.stev51.stevs_halloween_mod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.CommonHooks;
import net.neoforged.neoforge.items.ItemHandlerHelper;

public class AppleLeavesBlock extends LeavesBlock implements BonemealableBlock {

    public static final BooleanProperty APPLE_GROWTH = BooleanProperty.create("apple_growth");

    public AppleLeavesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any())
                .setValue(DISTANCE, 7))
                .setValue(PERSISTENT, false))
                .setValue(WATERLOGGED, false))
                .setValue(APPLE_GROWTH, true));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{DISTANCE, PERSISTENT, WATERLOGGED, APPLE_GROWTH});
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        boolean growth = state.getValue(APPLE_GROWTH);
        return !growth && stack.is(Items.BONE_MEAL) ? ItemInteractionResult.SKIP_DEFAULT_BLOCK_INTERACTION : ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {

        boolean growth = state.getValue(APPLE_GROWTH);

        if (growth) {

            int i = 1 + level.random.nextInt(3);
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.APPLE, i));
            level.playSound(null, pos, SoundEvents.CAVE_VINES_PICK_BERRIES, SoundSource.BLOCKS, 1f, 0.8f + level.random.nextFloat() * 0.4f);

            BlockState blockstate = state.setValue(APPLE_GROWTH, false);
            level.setBlockAndUpdate(pos, blockstate);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, blockstate));

            return InteractionResult.sidedSuccess(level.isClientSide);

        } else {

            return super.useWithoutItem(state, level, pos, player, hitResult);

        }

    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(APPLE_GROWTH);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

        boolean growth = state.getValue(APPLE_GROWTH);

        if (!growth) {
            BlockState blockstate = state.setValue(APPLE_GROWTH, true);
            level.setBlockAndUpdate(pos, blockstate);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(blockstate));
        }

    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 60;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 30;
    }

    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return !state.getValue(APPLE_GROWTH);
    }

    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        level.setBlockAndUpdate(pos, state.setValue(APPLE_GROWTH, true));
    }

}
