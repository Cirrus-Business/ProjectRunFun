package com.example.lizzy.runningapp_02.GameCode;

import com.example.lizzy.runningapp_02.StaticThings;

import java.util.Random;

/**
 * Created by Lizzy on 24/01/2015.
 */
public class Enemy extends Character {
    String[] sayings = {"Fuwaaahhh", "You're going down!"};
    //initiates attack when fight starts, resets to null when it ends
    Attack currentAttack = null;

    public Enemy(String name){
        this.name = name;
    }

    public Enemy(String name, int level, Item weapon, Item sheild){
        this.name = name;
        this.weapon = weapon;
        this.level = level;
        this.sheild = sheild;
    }

    @Override
    public String getDialogue() {
        if (inFight)
            return sayings[StaticThings.rand.nextInt(sayings.length)];
        else
            return "So you wanna fight? Punk?";
    }

    public boolean fightBack(){
        int decider = StaticThings.rand.nextInt() % 2;
        if (decider == 0){
            return true;
        } else {
            return false;
        }
    }

    public void initiateFight(){
        this.inFight = true;
        currentAttack = new Attack(this, StaticThings.player);
    }
}
