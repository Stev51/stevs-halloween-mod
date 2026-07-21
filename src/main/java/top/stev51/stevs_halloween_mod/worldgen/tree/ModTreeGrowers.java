package top.stev51.stevs_halloween_mod.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.worldgen.ModConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {

    public static final TreeGrower APPLE = new TreeGrower(
            HalloweenMod.MOD_ID + ":apple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.APPLE_KEY),
            Optional.empty()
    );

}
