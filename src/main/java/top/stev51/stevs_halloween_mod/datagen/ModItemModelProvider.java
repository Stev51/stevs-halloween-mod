package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HalloweenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.APPLE_PIE.get());

        withExistingParent(ModItems.GHOST_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.VAMPIRE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }

}
