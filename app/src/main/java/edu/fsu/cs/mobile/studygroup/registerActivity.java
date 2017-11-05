package edu.fsu.cs.mobile.studygroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

/**
 * Created by gracebunch on 11/5/17.
 */

public class registerActivity  extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }


    //clicking on register opens up mainActivity
    public void regToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
