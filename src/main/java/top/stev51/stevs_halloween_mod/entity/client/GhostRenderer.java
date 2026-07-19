package top.stev51.stevs_halloween_mod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.custom.GhostEntity;

public class GhostRenderer extends HumanoidMobRenderer<GhostEntity, HumanoidModel<GhostEntity>> {

    public GhostRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GhostEntity ghostEntity) {
        return ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "textures/entity/ghost/ghost.png");
    }

}
