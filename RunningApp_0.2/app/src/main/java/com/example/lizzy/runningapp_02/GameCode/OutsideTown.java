package com.example.lizzy.runningapp_02.GameCode;

import com.example.lizzy.runningapp_02.R;

/**
 * Created by Lizzy on 28/01/2015.
 */
public class OutsideTown extends Place{

    public OutsideTown(Place parent){
        super((parent.name+ ": Outer Town"), parent);
        this.townName = parent.name;
        innerPlaces.add(new Place("Black Smith", this));
        innerPlaces.add(new Place("Forest", this));
        innerPlaces.add(new Place("Campsite", this));
        innerPlaces.add(new Place("Farm", this));
        this.layout = R.layout.four_buildings_layout;
        this.backgroundImage = R.drawable.outer_town;
    }
}
