package com.test.testingmod.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.*;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;


public class EntityTransformationSpell extends EntitySpell {
    public EntityTransformationSpell(World worldIn) {
        super(worldIn);
    }

    public EntityTransformationSpell(World worldIn, EntityLivingBase throwerIn) {
        super(worldIn, throwerIn);
    }

    public EntityTransformationSpell(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }

     int randomEntity = 0;
    private  double x = 0;
    private   double y = 0;
    private  double z = 0;
    private float yaw = 0;
    private World worldIn;

    //private BlockPos spawnLocation;
    @Override
    protected void onImpact(RayTraceResult result) {
        super.onImpact(result);
        if (!this.world.isRemote) {
            if (result.entityHit != null) {
                if (!result.entityHit.isCreatureType(EnumCreatureType.MONSTER, true)) {
                    //  spawnLocation = result.getBlockPos();
                    Random ran = this.world.rand;
                   randomEntity = ran.nextInt(13) + 1;
                    result.entityHit.setDead();
                    x = result.entityHit.getPosition().getX();
                    y = result.entityHit.getPosition().getY();
                    z = result.entityHit.getPosition().getZ();
                    yaw = result.entityHit.getRotationYawHead();
                    worldIn = this.getEntityWorld();


                    switch (randomEntity) {

                        case 1: {
                            EntityChicken entitychicken = new EntityChicken(worldIn);
                            entitychicken.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitychicken);
                            break;
                        }
                        case 2: {

                            EntityCow entitycow = new EntityCow(worldIn);
                            entitycow.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitycow);
                            break;
                        }
                        case 3: {

                            EntitySheep entitysheep = new EntitySheep(worldIn);
                            entitysheep.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitysheep);
                            break;
                        }
                        case 4: {

                            EntityPig entitypig = new EntityPig(worldIn);
                            entitypig.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitypig);
                            break;
                        }
                        case 5: {

                            EntityBat entitybat = new EntityBat(worldIn);
                            entitybat.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitybat);
                            break;
                        }
                        case 6: {

                            EntityOcelot entityocelot = new EntityOcelot(worldIn);
                            entityocelot.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entityocelot);
                            break;
                        }

                        case 7: {

                            EntityHorse entityhorse = new EntityHorse(worldIn);
                            entityhorse.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entityhorse);
                            break;
                        }

                        case 8: {

                            EntityDonkey entitydonkey = new EntityDonkey(worldIn);
                            entitydonkey.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitydonkey);
                            break;
                        }

                        case 9: {

                            EntityMule entitymule = new EntityMule(worldIn);
                            entitymule.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitymule);
                            break;
                        }
                        case 10: {

                            EntityLlama entityllama = new EntityLlama(worldIn);
                            entityllama.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entityllama);
                            break;
                        }
                        case 11: {

                            EntityParrot entityparrot = new EntityParrot(worldIn);
                            entityparrot.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entityparrot);
                            break;
                        }
                        case 12: {

                            EntityRabbit entityrabbit = new EntityRabbit(worldIn);
                            entityrabbit.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entityrabbit);
                            break;
                        }
                        case 13: {

                            EntitySquid entitysquid = new EntitySquid(worldIn);
                            entitysquid.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entitysquid);
                            break;
                        }
                        case 14: {

                            EntityVillager entityvillager = new EntityVillager(worldIn);
                            entityvillager.setLocationAndAngles(x, y, z, yaw, 0.0F);
                            worldIn.spawnEntity(entityvillager);
                            break;
                        }
                    }
                    this.setDead();
                }
            }
        }
    }
}
