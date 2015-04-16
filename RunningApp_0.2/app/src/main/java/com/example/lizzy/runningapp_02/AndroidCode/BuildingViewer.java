package com.example.lizzy.runningapp_02.AndroidCode;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lizzy.runningapp_02.GameCode.Place;
import com.example.lizzy.runningapp_02.R;
import com.example.lizzy.runningapp_02.StaticThings;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class BuildingViewer extends Fragment {

    Place building;
    View view;

    public BuildingViewer() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int i = getArguments().getInt("BuildingIndex");
        building = (StaticThings.towns.get(StaticThings.currentTown)).getInnerPlaces().get(StaticThings.currentSegment).getInnerPlaces().get(i);
        view = inflater.inflate(building.getLayout(), container, false);
        view.setBackgroundResource(building.getBackgroundImage());
        return view;
    }


}
