package edu.fsu.cs.mobile.studygroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;



/**
 * Created by gracebunch on 10/22/17.
 */

public class pointsFragment extends Fragment {
    public pointsFragment() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static pointsFragment newInstance() {
        return new pointsFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.points_frag, container, false);


        return view;
    }
}
