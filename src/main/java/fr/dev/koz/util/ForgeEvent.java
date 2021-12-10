package fr.dev.koz.util;

import fr.dev.koz.KindOfZelda;
import fr.dev.koz.capabilities.TestCapability;
import fr.dev.koz.init.ModItems;
import fr.dev.koz.items.Orb;
import fr.dev.koz.items.OrbOfOrigin;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = KindOfZelda.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvent
{

    @SubscribeEvent
    public static void attachCapabilitiesEntity(final AttachCapabilitiesEvent<Entity> event)
    {
        if(event.getObject() instanceof PlayerEntity)
            event.addCapability(new ResourceLocation(KindOfZelda.MODID, "test"), new TestCapability());
    }

    @SubscribeEvent
    public static void playerJoinWorld(EntityJoinWorldEvent event) {

        if(event.getEntity() instanceof PlayerEntity){
            PlayerEntity player = (PlayerEntity) event.getEntity();
            if (player.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true ) {
                player.getCapability(TestCapability.TEST_CAPABILITY).ifPresent(cap -> {
                    if(cap.getValue() == 0){
                        player.addItemStackToInventory(new ItemStack(ModItems.ORB_OF_ORIGIN.get()));
                        player.addItemStackToInventory(new ItemStack(ModItems.HUMANS_ORB.get()));
                        player.addItemStackToInventory(new ItemStack(ModItems.GORONS_ORB.get()));
                        player.addItemStackToInventory(new ItemStack(ModItems.ZORAS_ORB.get()));
                    };
                });
            }
            else {
                player.addItemStackToInventory(new ItemStack(ModItems.ORB_OF_ORIGIN.get()));
                player.addItemStackToInventory(new ItemStack(ModItems.HUMANS_ORB.get()));
                player.addItemStackToInventory(new ItemStack(ModItems.GORONS_ORB.get()));
                player.addItemStackToInventory(new ItemStack(ModItems.ZORAS_ORB.get()));
            }
        }

    }
/*
    @SubscribeEvent
    public static void orbUse(PlayerInteractEvent.RightClickItem event) {
        PlayerEntity player = event.getPlayer();
        ItemStack stack = player.getHeldItem(event.getHand());
        if (stack.getItem() instanceof Orb) {
            if (player.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true) {
                player.getCapability(TestCapability.TEST_CAPABILITY).ifPresent(cap -> {
                    cap.specialities(player);
                });
            }
        }
    }*/
}


