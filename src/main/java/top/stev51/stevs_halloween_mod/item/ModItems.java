package top.stev51.stevs_halloween_mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.item.custom.ModFoodProperties;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HalloweenMod.MOD_ID);

    public static final DeferredItem<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.APPLE_PIE)
    ));

    public static final DeferredItem<Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.GHOST, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> VAMPIRE_SPAWN_EGG = ITEMS.register("vampire_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.VAMPIRE, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
