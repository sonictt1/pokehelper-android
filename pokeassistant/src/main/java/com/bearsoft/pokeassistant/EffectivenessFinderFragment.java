package com.bearsoft.pokeassistant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sonic on 1/8/2015.
 */
public class EffectivenessFinderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View chart = inflater.inflate(R.layout.effectiveness_finder, container, false);
        return chart;
    }
}
