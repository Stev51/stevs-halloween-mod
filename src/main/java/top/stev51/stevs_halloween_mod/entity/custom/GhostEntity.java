package top.stev51.stevs_halloween_mod.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import top.stev51.stevs_halloween_mod.sound.ModSoundEvents;

public class GhostEntity extends BaseHalloweenMonster {

    public GhostEntity(EntityType<? extends BaseHalloweenMonster> entityType, Level level) {
        super(entityType, level,
                false, false);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 10)
                .add(Attributes.MOVEMENT_SPEED, 0.35d)
                .add(Attributes.ATTACK_DAMAGE, 2.0d);
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        return ModSoundEvents.GHOST_AMBIENT.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return ModSoundEvents.GHOST_HURT.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSoundEvents.GHOST_DEATH.get();
    }

}
