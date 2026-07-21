package top.stev51.stevs_halloween_mod.entity.client;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.custom.FrankensteinEntity;
import top.stev51.stevs_halloween_mod.entity.custom.GhostEntity;

public class FrankensteinRenderer extends HumanoidMobRenderer<FrankensteinEntity, HumanoidModel<FrankensteinEntity>> {

    public FrankensteinRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(FrankensteinEntity frankensteinEntity) {
        return ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "textures/entity/frankenstein/frankenstein.png");
    }

}
