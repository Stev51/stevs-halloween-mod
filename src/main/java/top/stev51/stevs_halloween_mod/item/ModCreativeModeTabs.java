package top.stev51.stevs_halloween_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HalloweenMod.MOD_ID);

    public static final Supplier<CreativeModeTab> HALLOWEEN_MOD_TAB = CREATIVE_MODE_TAB.register("stevs_halloween_mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.JACK_O_LANTERN))
                    .title(Component.translatable("creativetab.stevs_halloween_mod.stevs_halloween_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Food
                        output.accept(ModItems.APPLE_PIE);

                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
