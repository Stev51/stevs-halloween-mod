package top.stev51.stevs_halloween_mod.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.ModBlocks;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.item.custom.ModFoodProperties;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HalloweenMod.MOD_ID);



    // Misc

    public static final DeferredItem<Item> APPLE_CORE = ITEMS.register("apple_core",
            () -> new ItemNameBlockItem(ModBlocks.APPLE_SAPLING.get(), new Item.Properties())
    );

    // Spawn Eggs

    public static final DeferredItem<Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.GHOST, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> VAMPIRE_SPAWN_EGG = ITEMS.register("vampire_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.VAMPIRE, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> WEREWOLF_SPAWN_EGG = ITEMS.register("werewolf_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.WEREWOLF, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> FRANKENSTEIN_SPAWN_EGG = ITEMS.register("frankenstein_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.FRANKENSTEIN, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> MUMMY_SPAWN_EGG = ITEMS.register("mummy_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MUMMY, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> DEVIL_SPAWN_EGG = ITEMS.register("devil_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.DEVIL, 0xffffff, 0xffffff, new Item.Properties())
    );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
