package edu.fsu.cs.mobile.studygroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import android.widget.EditText;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import android.widget.Toast;

import android.support.annotation.NonNull;


/**
 * Created by gracebunch on 11/5/17.
 */

public class registerActivity  extends AppCompatActivity{

    private DatabaseReference mDatabase;

    private EditText fname;
    private EditText lname;
    private EditText email;
    private EditText username;
    private EditText password;
    private FirebaseAuth auth;
    private FirebaseAnalytics mfba;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        mfba = FirebaseAnalytics.getInstance(this);
        auth= FirebaseAuth.getInstance();
        mDatabase= FirebaseDatabase.getInstance().getReference();

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        email= (EditText) findViewById(R.id.email);
        username = (EditText) findViewById(R.id.username_reg);
        password = (EditText) findViewById(R.id.password_reg);
    }



    //clicking on register opens up mainActivity
    public void regToMain(View view){
        //create child in root
        //assign value to child
        if(TextUtils.isEmpty(email.getText().toString())){
            Toast.makeText(getApplicationContext(), "Enter email address", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(fname.getText().toString())){
            Toast.makeText(getApplicationContext(), "Enter first name", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(lname.getText().toString())){
            Toast.makeText(getApplicationContext(), "Enter last name", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(username.getText().toString())){
            Toast.makeText(getApplicationContext(), "Enter username", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password.getText().toString())){
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        String email1 =email.getText().toString().trim();
        String pass = password.getText().toString().trim();



        //Some reason this is failing to add the user to Firebase ????
        auth.createUserWithEmailAndPassword(email1, pass)
                .addOnCompleteListener(registerActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //Log.d("TAG", "createUserWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                           Toast.makeText(registerActivity.this, "Failed",
                                   Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(registerActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        }


                    }
                });








            //add these 2 lines once I figure out how to add the user
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);

    }

}
