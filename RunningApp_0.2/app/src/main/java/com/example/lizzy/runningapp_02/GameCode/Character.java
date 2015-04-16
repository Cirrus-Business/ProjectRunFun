package com.example.lizzy.runningapp_02.GameCode;

import com.example.lizzy.runningapp_02.StaticThings;

/**
 * Created by Lizzy on 24/01/2015.
 */
public abstract class Character {
    String name = "default name";
    int level = 0;
    //think about how to do all this stuff
    int currentDamage = 0;
    boolean inFight = false;
    Item weapon = null;
    Item sheild = null;
    boolean isDead = false;

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public abstract String getDialogue();

    public void initiateFight(){
        inFight = true;
    }

    public boolean fightBack(){
        return false;
    }

    public int takeMinDamage(){
        int damage = StaticThings.rand.nextInt(getHealth()/5);
        currentDamage += damage;
        return damage;
    }

    public int getHealth(){
        return (level + 5 - currentDamage);
    }

}
