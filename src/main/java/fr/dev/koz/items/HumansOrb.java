package fr.dev.koz.items;

import fr.dev.koz.capabilities.TestCapability;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import net.minecraft.world.item.Item.Properties;

public class HumansOrb extends Orb {

    public HumansOrb(Properties properties) {
        super(properties);
    }

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true) {

            playerIn.getCapability(TestCapability.TEST_CAPABILITY).ifPresent( cap -> {
                if (cap.getValue() != 1) {
                    cap.setValue(1);
                }
            });
            ItemStack itemstack = playerIn.getHeldItem(handIn);
            //itemstack.shrink(1);
            return super.onItemRightClick(worldIn, playerIn, handIn);
        }
        else {
            return super.onItemRightClick(worldIn, playerIn, handIn);
        }
    }*/
}
