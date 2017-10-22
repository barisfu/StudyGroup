package edu.fsu.cs.mobile.studygroup;

import android.view.View;

import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gracebunch on 10/22/17.
 */


public class eventFragment extends Fragment {

    public eventFragment() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static eventFragment newInstance() {
        return new eventFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.event_frag, container, false);


        return view;
    }
}