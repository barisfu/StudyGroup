package com.example.khawly.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Create_Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_event);
        // Toolbar toolbar;
        //Object id = null;
        //toolbar = (Toolbar) findViewById(id.toolbar);
        //  setSupportActionBar(toolbar);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Eventname = (EditText) findViewById(R.id.Eventname);
                EditText DateandTime = (EditText) findViewById(R.id.DateandTime);
                EditText Location = (EditText) findViewById(R.id.Location);

                String en = Eventname.getText().toString();
                String dt = DateandTime.getText().toString();
                String loc = Location.getText().toString();

              Intent intent1 = new Intent(getApplicationContext(), Event_Created.class);
              intent1.putExtra("event", en);
              intent1.putExtra("date", dt);
              intent1.putExtra("location", loc);
              startActivity(intent1);

            }
        });
    }
}


