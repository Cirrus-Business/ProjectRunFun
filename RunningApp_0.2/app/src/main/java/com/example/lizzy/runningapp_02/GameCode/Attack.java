package com.example.lizzy.runningapp_02.GameCode;

import java.util.Random;

/**
 * Created by Lizzy on 25/01/2015.
 */
public class Attack implements Action, Interaction{
    Character attacker = null;
    Character attackee = null;
    Random rand = new Random();

    public Attack(Character attacker, Character attackee){
        this.attackee = attackee;
        this.attacker = attacker;
    }

    public boolean doAction(){
        return true;
    }

    @Override
    public String getName() {
        return ("Attack " + attackee.getName());
    }

    @Override
    public Character getOtherCharacter() {
        return attackee;
    }
}
