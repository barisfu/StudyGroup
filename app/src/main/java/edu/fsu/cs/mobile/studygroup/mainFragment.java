package edu.fsu.cs.mobile.studygroup;

/**
 * Created by gracebunch on 10/22/17.
 */


import android.content.Context;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;




public class mainFragment extends Fragment {

   // private OnFragmentInteractionListener mListener;
    public mainFragment() {
    }



    //creates the frag when called
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         }

    public static mainFragment newInstance(){
        return new mainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       // TextView username= (TextView) getView().findViewById(R.id.user_display);
       // String txt= getArguments().getString("username");
      //  username.setText(txt);

        View view = inflater.inflate(R.layout.main_frag, container, false);


        return view;


    }


}
