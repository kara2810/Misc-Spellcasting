package com.test.testingmod.Events;

import com.test.testingmod.Entity.EntityTransformationSpell;
import com.test.testingmod.Init.SoundInit;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;
import java.util.Random;

/**
 * Created by KARLX on 09/10/2018.
 */
public class ChatEvent {
    TextComponentString chant;

    @SubscribeEvent
    public void chatEvent(ServerChatEvent event) {
        //PacketHandler.INSTANCE.sendToServer(new PacketChatKey());
        String chant = "Yu Mo Gwai Gui Fai Di Zao";//"test";
        ItemStack wand = new ItemStack(Items.FISH, 1, 3);
        ItemStack glowstone = new ItemStack(Items.GLOWSTONE_DUST);
        List<?> msgs = Minecraft.getMinecraft().ingameGUI.getChatGUI().getSentMessages();
        String lastMsg = (String) msgs.get(msgs.size() - 1);
        RayTraceResult result = Minecraft.getMinecraft().objectMouseOver;
        Random ran = new Random();
        int randomEntity = 0;
        double x = 0;
        double y = 0;
        double z = 0;
        float yaw = 0;
        //RayTraceResult test = Minecraft.getMinecraft().player.rayTrace(100, 20);

        if (chant.equalsIgnoreCase(lastMsg)) {
            //  if(event.getComponent().equals(chant)){
            if (event.getPlayer().getHeldItemOffhand().isItemEnchanted()) {
                if (event.getPlayer().getHeldItemOffhand().isItemEqual(wand)) {
                    NBTTagList enchants = event.getPlayer().getHeldItemOffhand().getEnchantmentTagList();
                    int i;
                    boolean hasEfficiency = false;
                    for (i = 0; i < enchants.tagCount(); i++) {
                        if (((NBTTagCompound) enchants.getCompoundTagAt(i)).getShort("id") == 32) {
                            hasEfficiency = true;
                            break;
                        }
                    }
                    if (hasEfficiency) {
                        World worldIn = event.getPlayer().getEntityWorld();
                        EntityPlayer playerIn = event.getPlayer();


                        if (event.getPlayer().getHeldItemMainhand().isItemEqual(glowstone)) {
                            event.getPlayer().sendStatusMessage(new TextComponentString(TextFormatting.GREEN + "Derp"), false);

                            if (!worldIn.isRemote) {
                                EntityTransformationSpell entitySpell = new EntityTransformationSpell(worldIn, playerIn);
                                entitySpell.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
                                worldIn.spawnEntity(entitySpell);
                                entitySpell.playSound(SoundInit.chant, 1F, 1F);


                                if (!event.getPlayer().capabilities.isCreativeMode) {
                                    event.getPlayer().getHeldItemMainhand().shrink(1);
                                }
                            }
                        }

                    }

                }
            }
        }
    }
}




