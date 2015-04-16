package com.example.lizzy.runningapp_02.AndroidCode;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lizzy.runningapp_02.GameCode.Place;
import com.example.lizzy.runningapp_02.R;
import com.example.lizzy.runningapp_02.StaticThings;

public class WorldViewer extends Fragment implements View.OnClickListener{

    View view;
    final Place town = StaticThings.towns.get(StaticThings.currentTown);
    final Place segment = town.getInnerPlaces().get(StaticThings.currentSegment);

    public WorldViewer() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View v) {
        Fragment newFragment = new BuildingViewer();
        Bundle b  = new Bundle();

        if (v.getId() == R.id.button1){
            b.putInt("BuildingIndex", 0);
        } else if (v.getId() == R.id.button2){
            b.putInt("BuildingIndex", 1);
        } else if (v.getId() == R.id.button3){
            b.putInt("BuildingIndex", 2);
        }else if (v.getId() == R.id.button4){
            b.putInt("BuildingIndex", 3);
        }

        newFragment.setArguments(b);

        FragmentTransaction ft = (getFragmentManager()).beginTransaction();
        ft.replace(R.id.fragmentContainer, newFragment);
        ft.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(segment.getLayout(), container, false);

        ImageButton up = (ImageButton) view.findViewById(R.id.upButton);
        ImageButton down = (ImageButton) view.findViewById(R.id.downButton);
        ImageButton right = (ImageButton) view.findViewById(R.id.rightButton);
        ImageButton left = (ImageButton) view.findViewById(R.id.leftButton);

        if(segment.getNeighbours().get(Place.NORTH) == null){
            up.setBackgroundResource(R.drawable.no);
        } else {
            up.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StaticThings.currentSegment = town.getInnerPlaces().indexOf(segment.getNeighbours().get(Place.NORTH));
                    Fragment newFragment = new WorldViewer();
                    FragmentTransaction ft = (getFragmentManager()).beginTransaction();
                    ft.replace(R.id.fragmentContainer, newFragment);
                    ft.commit();
                }
            });
        }
//
        if(segment.getNeighbours().get(Place.SOUTH) == null){
            down.setBackgroundResource(R.drawable.no);
        } else {
            down.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StaticThings.currentSegment = town.getInnerPlaces().indexOf(segment.getNeighbours().get(Place.SOUTH));
                    Fragment newFragment = new WorldViewer();
                    FragmentTransaction ft = (getFragmentManager()).beginTransaction();
                    ft.replace(R.id.fragmentContainer, newFragment);
                    ft.commit();
                }
            });
        }

        if(segment.getNeighbours().get(Place.EAST) == null){
            right.setBackgroundResource(R.drawable.no);
        } else {
            right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StaticThings.currentSegment = town.getInnerPlaces().indexOf(segment.getNeighbours().get(Place.EAST));
                    Fragment newFragment = new WorldViewer();
                    FragmentTransaction ft = (getFragmentManager()).beginTransaction();
                    ft.replace(R.id.fragmentContainer, newFragment);
                    ft.commit();
                }
            });
        }

        if(segment.getNeighbours().get(Place.WEST) == null){
            left.setBackgroundResource(R.drawable.no);
        } else {
            left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    StaticThings.currentSegment = town.getInnerPlaces().indexOf(segment.getNeighbours().get(Place.WEST));
                    Fragment newFragment = new WorldViewer();
                    FragmentTransaction ft = (getFragmentManager()).beginTransaction();
                    ft.replace(R.id.fragmentContainer, newFragment);
                    ft.commit();
                }
            });
        }

        (view.findViewById(R.id.button1)).setOnClickListener(this);
        (view.findViewById(R.id.button2)).setOnClickListener(this);
        (view.findViewById(R.id.button3)).setOnClickListener(this);
        if (segment.getInnerPlaces().size() > 3){
            (view.findViewById(R.id.button4)).setOnClickListener(this);
        }


        return view;
    }

}
