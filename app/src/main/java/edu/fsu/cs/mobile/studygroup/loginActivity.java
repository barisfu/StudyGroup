package edu.fsu.cs.mobile.studygroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by gracebunch on 11/2/17.
 */

public class loginActivity extends AppCompatActivity {
    EditText username;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }


    //clicking login opens mainActivity
    public void loginToMain(View view){
        //puts username in bundle to send to main
        username= (EditText) findViewById(R.id.username);
        Bundle b = new Bundle();
        b.putString("username", username.getText().toString());

        //opens main
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void registerPage(View view){

        Intent intent= new Intent(this, registerActivity.class);
        startActivity(intent);
    }
}