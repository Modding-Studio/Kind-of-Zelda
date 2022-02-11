package fr.dev.koz.items;

public class GoronsOrb extends Orb {

    public GoronsOrb(Properties properties) {
        super(properties);
    }
/*
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.getCapability(TestCapability.TEST_CAPABILITY).isPresent() == true) {

            playerIn.getCapability(TestCapability.TEST_CAPABILITY).ifPresent( cap -> {
                if (cap.getValue() != 2) {
                    cap.setValue(2);
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
