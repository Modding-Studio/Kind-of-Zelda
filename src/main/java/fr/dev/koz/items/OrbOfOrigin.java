package fr.dev.koz.items;

public class OrbOfOrigin extends Orb {

    public OrbOfOrigin(Properties properties) {
        super(properties);
    }

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(playerIn.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true) {

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
