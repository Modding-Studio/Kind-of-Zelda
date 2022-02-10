package fr.dev.koz.capabilities;


import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

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

    private final float max_health = 20.0f;  //MAX_HEALTH
    private final float knockback_resistance = 0.0f;  //KNOCKBACK_RESISTANCE
    private final float movement_speed = 0.1f;  //MOVEMENT_SPEED
    private final float flying_speed = 0.1f;  //FLYING_SPEED
    private final float attack_damage = 1.0f;  //ATTACK_DAMAGE
    private final float attack_knockback = 0.0f;  //ATTACK_KNOCKBACK
    private final float attack_speed = 1.0f;  //ATTACK_SPEED
    private final float armor = 0.0f;  //ARMOR
    private final float armor_toughness = 0.0f;  //ARMOR_TOUGHNESS
    private final float luck = 0.0f;  //LUCK

    @Override
    public int getValue() {
        return this.race;
    }

    @Override
    public void setValue(int lData) {
        this.race = lData;
    }

    @Override
    public void resetStats(Player playerIn) {
        setStats(playerIn , 0f, 0f, 1f, 1f, 0f, 0f, 1f, 0f, 0f, 0f);
    }

    @Override
    public void setStats(Player playerIn, float lMaxHealth, float lKnockbackRes, float lMoveSpeed, float lFlySpeed, float lAttackDamage, float lAttackKnockback, float lAttackSpeed, float lArmor, float lToughness, float lLuck) {
        playerIn.getAttribute(Attributes.MAX_HEALTH).setBaseValue(max_health + lMaxHealth);
        playerIn.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(knockback_resistance + lKnockbackRes);
        playerIn.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(movement_speed * lMoveSpeed);
        //playerIn.getAttribute(Attributes.FLYING_SPEED).setBaseValue(flying_speed * lFlySpeed);
        playerIn.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(attack_damage + lAttackDamage);
        //playerIn.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(attack_knockback + lAttackKnockback);
        playerIn.getAttribute(Attributes.ATTACK_SPEED).setBaseValue(attack_speed * lAttackSpeed);
        playerIn.getAttribute(Attributes.ARMOR).setBaseValue(armor + lArmor);
        playerIn.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(armor_toughness + lToughness);
        playerIn.getAttribute(Attributes.LUCK).setBaseValue(luck + lLuck);
    }

    @Override
    public void specialities(Player playerIn) {
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
