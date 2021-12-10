package fr.dev.koz.capabilities;

import net.minecraft.entity.player.PlayerEntity;

public interface ITest {

    public int getValue();
    public void setValue(int lData);
    public void resetStats(PlayerEntity playerIn);
    public void setStats(PlayerEntity playerIn, float lMaxHealth, float lKnockbackRes, float lMoveSpeed, float lFlySpeed, float lAttackDamage, float lAttackKnockback, float lAttackSpeed, float lArmor, float lToughness, float lLuck);
    public void specialities(PlayerEntity playerIn);

}
