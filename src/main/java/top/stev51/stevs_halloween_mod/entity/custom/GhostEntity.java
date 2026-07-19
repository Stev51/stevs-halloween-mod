package top.stev51.stevs_halloween_mod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class GhostEntity extends BaseHalloweenMonster {

    public GhostEntity(EntityType<? extends BaseHalloweenMonster> entityType, Level level) {
        super(entityType, level,
                false, false);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.25d)
                .add(Attributes.ATTACK_DAMAGE, 3.0d);
    }

}
