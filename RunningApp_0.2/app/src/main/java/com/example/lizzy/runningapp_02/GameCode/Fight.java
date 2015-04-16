package com.example.lizzy.runningapp_02.GameCode;

/**
 * Created by Lizzy on 25/01/2015.
 */
public class Fight implements Action, Interaction {

    Character otherCharacter = null;

    public Fight(Character otherCharacter){
        this.otherCharacter = otherCharacter;
    }

    @Override
    public boolean doAction() {
        //initiate fight sequence / action
        return false;
    }

    @Override
    public String getName() {
        return ("Fight " + otherCharacter.getName());
    }

    @Override
    public Character getOtherCharacter() {
        return otherCharacter;
    }
}
