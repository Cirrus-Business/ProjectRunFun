package com.example.lizzy.runningapp_02.GameCode;

import com.example.lizzy.runningapp_02.R;

/**
 * Created by Lizzy on 28/01/2015.
 */
public class Building extends Place {

    public Building(Place parent, String name, int backgroundImg){
        super((parent.name + ": " + name), parent);
        this.townName = parent.name;
        this.layout = R.layout.building_layout;
        this.backgroundImage = backgroundImg;
    }
}
