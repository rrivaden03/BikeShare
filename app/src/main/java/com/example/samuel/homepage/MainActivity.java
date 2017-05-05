package com.example.samuel.homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonProfile = (Button) findViewById(R.id.buttonProfile);
        buttonProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityProfile.class);
                startActivity(intent);
            }
        });

        Button buttonBikes = (Button) findViewById(R.id.buttonBikes);
        buttonBikes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

        Button buttonAbout = (Button) findViewById(R.id.buttonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityAbout.class);
                startActivity(intent);
            }
        });
    }
}
