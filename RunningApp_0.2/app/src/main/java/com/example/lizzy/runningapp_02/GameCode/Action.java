package com.example.lizzy.runningapp_02.GameCode;

/**
 * Created by Lizzy on 24/01/2015.
 */
public interface Action {

    String name = "default action name";

    public String getName();

    public boolean doAction();
}
