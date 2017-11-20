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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import android.widget.EditText;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import android.content.Intent;
import android.widget.Toast;



public class mainFragment extends Fragment {

    private FirebaseUser user;
    private FirebaseAuth auth;

    TextView username;
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




        View view = inflater.inflate(R.layout.main_frag, container, false);
        auth= FirebaseAuth.getInstance();
        user= auth.getCurrentUser();

        //sets displayname as username in this fragment  - doesn't work if register first
        username= (TextView) view.findViewById(R.id.user_display);
        username.setText(user.getDisplayName());

        return view;


    }


}
