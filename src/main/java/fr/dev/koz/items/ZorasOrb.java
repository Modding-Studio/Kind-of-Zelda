package fr.dev.koz.items;

public class ZorasOrb extends Orb {

    public ZorasOrb(Properties properties) {
        super(properties);
    }
/*
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true) {

            playerIn.getCapability(TestCapability.TEST_CAPABILITY).ifPresent( cap -> {
                if (cap.getValue() != 3) {
                    cap.setValue(3);
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
