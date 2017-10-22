package edu.fsu.cs.mobile.studygroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by gracebunch on 10/22/17.
 */

public class searchFragment extends Fragment{
    public searchFragment() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static searchFragment newInstance() {
        return new searchFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.search_frag, container, false);


        return view;
    }
}

