package fr.dev.koz.items;


import fr.dev.koz.capabilities.TestCapability;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;


import net.minecraft.world.item.Item.Properties;

public class Orb extends Item {

    //public int value = 0;

    public Orb(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {

        ItemStack stack = playerIn.getItemInHand(handIn);
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
        return super.use(worldIn, playerIn, handIn);
    }
}


