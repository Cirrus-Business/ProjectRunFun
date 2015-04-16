package com.example.lizzy.runningapp_02;

import com.example.lizzy.runningapp_02.GameCode.OutsideTown;
import com.example.lizzy.runningapp_02.GameCode.Place;
import com.example.lizzy.runningapp_02.GameCode.Player;
import com.example.lizzy.runningapp_02.GameCode.SmallTownCenter;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Lizzy on 25/01/2015.
 */
public class StaticThings {
    public static Random rand = new Random();
    public static Player player = null;
    public static int currentTown = 0;
    public static int currentSegment = 0;
    public static ArrayList<Place> towns = new ArrayList<Place>();

    public static void setUpTowns(){
        Place alpha = new Place("Town Alpha");
        Place center = new SmallTownCenter(alpha);
        Place outer = new OutsideTown(alpha);
        center.addNeighbours(null, null, outer, null);
        outer.addNeighbours(null, null, null, center);
        alpha.addInnerPlace(center);
        alpha.addInnerPlace(outer);
        towns.add(alpha);
    }
}
