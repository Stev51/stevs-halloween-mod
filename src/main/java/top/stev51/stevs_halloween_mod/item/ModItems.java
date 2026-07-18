package top.stev51.stevs_halloween_mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.item.custom.ModFoodProperties;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HalloweenMod.MOD_ID);

    public static final DeferredItem<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.APPLE_PIE)
    ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
