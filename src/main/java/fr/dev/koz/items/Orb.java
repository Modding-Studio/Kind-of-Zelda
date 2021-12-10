package fr.dev.koz.items;


import fr.dev.koz.capabilities.TestCapability;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


public class Orb extends Item {

    //public int value = 0;

    public Orb(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        ItemStack stack = playerIn.getHeldItem(handIn);
        if (stack.getItem() instanceof Orb) {
            if (playerIn.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true) {
                playerIn.getCapability(TestCapability.TEST_CAPABILITY).ifPresent(cap -> {
                    int value = 0;
                    if (stack.getItem() instanceof HumansOrb) { value = 1;}
                    if (stack.getItem() instanceof GoronsOrb) { value = 2;}
                    if (stack.getItem() instanceof ZorasOrb) { value = 3;}
                    cap.setValue(value);
                    cap.specialities(playerIn);
                });
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}


