package fr.dev.koz.capabilities;

import net.minecraft.world.entity.player.Player;

public interface ITest {

    public int getValue();
    public void setValue(int lData);
    public void resetStats(Player playerIn);
    public void setStats(Player playerIn, float lMaxHealth, float lKnockbackRes, float lMoveSpeed, float lFlySpeed, float lAttackDamage, float lAttackKnockback, float lAttackSpeed, float lArmor, float lToughness, float lLuck);
    public void specialities(Player playerIn);

}
