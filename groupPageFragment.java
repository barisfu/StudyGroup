package edu.fsu.cs.mobile.studygroup;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gracebunch on 10/22/17.
 */

public class groupPageFragment extends Fragment {
    public groupPageFragment() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static groupPageFragment newInstance() {
        return new groupPageFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.group_page_frag, container, false);


        return view;
    }
}

