package com.example.lizzy.runningapp_02.GameCode;

import com.example.lizzy.runningapp_02.StaticThings;

import java.util.ArrayList;

/**
 * Created by Lizzy on 25/01/2015.
 */
public class Player extends Character {
    Attack currentAttack = null;
    boolean isMale = true;
    ArrayList<Item> inventory = new ArrayList<Item>();
    int cash = 0;

    public Player(String name, boolean gender){
        this.name = name;
        this.isMale = gender;
    }

    @Override
    public String getDialogue() {
        if (inFight)
            return "I'm the protaginist, of course I will win";
        else
            return "whoop-di-doop";
    }

    //Auto-pilot mode, shouldn't be called
    public boolean fightBack(){
        return true;
    }

    public void initiateFight(){
        this.inFight = true;
        //do after player is created
        currentAttack = new Attack(this, StaticThings.player);
    }
}
