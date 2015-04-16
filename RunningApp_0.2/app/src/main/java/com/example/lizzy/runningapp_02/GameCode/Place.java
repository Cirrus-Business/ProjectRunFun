package com.example.lizzy.runningapp_02.GameCode;

import android.text.Layout;

import java.util.ArrayList;

/**
 * Created by Lizzy on 24/01/2015.
 */

public class Place {
    String name;
    Place parent = null;
    String type = "default place";
    int layout;
    int backgroundImage;
    ArrayList<Place> innerPlaces = new ArrayList<Place>();
    //ArrayList<Action> actions;
    ArrayList<Place> neighbours = new ArrayList<Place>();
    public static int NORTH = 0;
    public static int SOUTH = 1;
    public static int EAST = 2;
    public static int WEST = 3;
    String townName = "is a town";

    public Place(String name){
        this.name = name;
    }

    public Place(String name, Place parent) {
        this.name = name;
        this.parent = parent;
    }

    public Place(String name, Place parent, ArrayList<Place> innerPlaces, ArrayList<Place> neighbours) {
        this.name = name;
        this.parent = parent;
        this.innerPlaces = innerPlaces;
        neighbours = neighbours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Place> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<Place> neighbours) {
        neighbours = neighbours;
    }

    public ArrayList<Place> getInnerPlaces() {
        return innerPlaces;
    }

    public void setInnerPlaces(ArrayList<Place> innerPlaces) {
        this.innerPlaces = innerPlaces;
    }

    public Place getParent() {
        return parent;
    }

    public void setParent(Place parent) {
        this.parent = parent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public void addNeighbours(Place north, Place south, Place east, Place west){
        neighbours.add(north);
        neighbours.add(south);
        neighbours.add(east);
        neighbours.add(west);
    }

    public void addInnerPlace(Place place){
        innerPlaces.add(place);
    }
}
