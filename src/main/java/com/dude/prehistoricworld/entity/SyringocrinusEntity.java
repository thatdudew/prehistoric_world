
package com.dude.prehistoricworld.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import com.dude.prehistoricworld.procedures.ProconodontusOnEntityTickUpdateProcedure;
import com.dude.prehistoricworld.init.PrehistoricWorldModItems;
import com.dude.prehistoricworld.init.PrehistoricWorldModEntities;

public class SyringocrinusEntity extends PathfinderMob {
	public SyringocrinusEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(PrehistoricWorldModEntities.SYRINGOCRINUS.get(), world);
	}

	public SyringocrinusEntity(EntityType<SyringocrinusEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.3f);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SyringocrinusEntity.this.isInWater())
					SyringocrinusEntity.this.setDeltaMovement(SyringocrinusEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !SyringocrinusEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SyringocrinusEntity.this.getX();
					double dy = this.wantedY - SyringocrinusEntity.this.getY();
					double dz = this.wantedZ - SyringocrinusEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SyringocrinusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					SyringocrinusEntity.this.setYRot(this.rotlerp(SyringocrinusEntity.this.getYRot(), f, 10));
					SyringocrinusEntity.this.yBodyRot = SyringocrinusEntity.this.getYRot();
					SyringocrinusEntity.this.yHeadRot = SyringocrinusEntity.this.getYRot();
					if (SyringocrinusEntity.this.isInWater()) {
						SyringocrinusEntity.this.setSpeed((float) SyringocrinusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SyringocrinusEntity.this.setXRot(this.rotlerp(SyringocrinusEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SyringocrinusEntity.this.getXRot() * (float) (Math.PI / 180.0));
						SyringocrinusEntity.this.setZza(f3 * f1);
						SyringocrinusEntity.this.setYya((float) (f1 * dy));
					} else {
						SyringocrinusEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SyringocrinusEntity.this.setSpeed(0);
					SyringocrinusEntity.this.setYya(0);
					SyringocrinusEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1.8, 40));
		this.goalSelector.addGoal(2, new PanicGoal(this, 2));
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(PrehistoricWorldModItems.SYRINGOCRINUSRAW.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		ProconodontusOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.5);
		return builder;
	}
}
