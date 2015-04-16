package com.example.lizzy.runningapp_02.GameCode;

import com.example.lizzy.runningapp_02.R;

/**
 * Created by Lizzy on 28/01/2015.
 */
public class SmallTownCenter extends Place {

    public SmallTownCenter(Place parent){
        super((parent.name+ ": Town Center"), parent);
        this.townName = parent.name;
        innerPlaces.add(new Place("Government Building", this));
        innerPlaces.add(new Place("Church", this));
        innerPlaces.add(new Place("School", this));
        this.layout = R.layout.three_buildings_layout;
        this.backgroundImage = R.drawable.small_town_center;
    }
}
