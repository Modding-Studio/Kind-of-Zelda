package fr.dev.koz.capabilities;


import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;

public class Test implements ITest
{
    /*
    race = 0 -> DefaultValue
    race = 1 -> Humans
    race = 2 -> Gorons
    race = 3 -> Zoras
    race = 4 -> Hylians
    race = 5 -> Celestians
     */

    private int race = 0;

    private final float max_health = 20.0f;  //field_233818_a_
    private final float knockback_resistance = 0.0f;  //field_233820_c_
    private final float movement_speed = 0.1f;  //field_233821_d_
    private final float flying_speed = 0.1f;  //field_233822_e_
    private final float attack_damage = 1.0f;  //field_233823_f_
    private final float attack_knockback = 0.0f;  //field_233824_g_
    private final float attack_speed = 1.0f;  //field_233825_h_
    private final float armor = 0.0f;  //field_233826_i_
    private final float armor_toughness = 0.0f;  //field_233827_j_
    private final float luck = 0.0f;  //field_233828_k_

    @Override
    public int getValue() {
        return this.race;
    }

    @Override
    public void setValue(int lData) {
        this.race = lData;
    }

    @Override
    public void resetStats(PlayerEntity playerIn) {
        setStats(playerIn , 0f, 0f, 1f, 1f, 0f, 0f, 1f, 0f, 0f, 0f);
    }

    @Override
    public void setStats(PlayerEntity playerIn, float lMaxHealth, float lKnockbackRes, float lMoveSpeed, float lFlySpeed, float lAttackDamage, float lAttackKnockback, float lAttackSpeed, float lArmor, float lToughness, float lLuck) {
        playerIn.getAttribute(Attributes.field_233818_a_).setBaseValue(max_health + lMaxHealth);
        playerIn.getAttribute(Attributes.field_233820_c_).setBaseValue(knockback_resistance + lKnockbackRes);
        playerIn.getAttribute(Attributes.field_233821_d_).setBaseValue(movement_speed * lMoveSpeed);
        //playerIn.getAttribute(Attributes.field_233822_e_).setBaseValue(flying_speed * lFlySpeed);
        playerIn.getAttribute(Attributes.field_233823_f_).setBaseValue(attack_damage + lAttackDamage);
        //playerIn.getAttribute(Attributes.field_233824_g_).setBaseValue(attack_knockback + lAttackKnockback);
        playerIn.getAttribute(Attributes.field_233825_h_).setBaseValue(attack_speed * lAttackSpeed);
        playerIn.getAttribute(Attributes.field_233826_i_).setBaseValue(armor + lArmor);
        playerIn.getAttribute(Attributes.field_233827_j_).setBaseValue(armor_toughness + lToughness);
        playerIn.getAttribute(Attributes.field_233828_k_).setBaseValue(luck + lLuck);
    }

    @Override
    public void specialities(PlayerEntity playerIn) {
        if(this.race == 1) {  //Humans
            resetStats(playerIn);
        }

        if(this.race == 2) {  //Gorons
            resetStats(playerIn);
            setStats(playerIn , 4f, 2f, 0.8f, 1f, 0f, 0f, 1f, 2f, 1f, 0f);
        }

        if(this.race == 3) {  //Zoras
            resetStats(playerIn);
            setStats(playerIn , 0f, 0f, 1f, 1f, 0f, 0f, 1f, 0f, 0f, 0f);
        }
    }

}
