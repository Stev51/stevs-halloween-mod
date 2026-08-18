package top.stev51.stevs_halloween_mod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import top.stev51.stevs_halloween_mod.HalloweenMod;

public class ModTags {

    public static class Items {

        public static final TagKey<Item> CANDY = createTag("candy");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, name));
        }

    }

}
