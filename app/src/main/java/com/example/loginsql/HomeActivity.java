package com.example.loginsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button mapButton, covidButton, contactButton, photogalleryButton, activitiesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mapButton = (Button) findViewById(R.id.mapbutton);
        covidButton = (Button) findViewById(R.id.covidguidebtn);
        contactButton = (Button) findViewById(R.id.contactbtn);
        photogalleryButton = (Button) findViewById(R.id.photogallerybtn);
        activitiesButton = (Button) findViewById(R.id.activitiesbtn);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,map.class);
                startActivity(intent);
                finish();
            }
        });

        covidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CovidGuidelines.class);
                startActivity(intent);
                finish();
            }
        });
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ContactUs.class);
                startActivity(intent);
                finish();
            }
        });

        photogalleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Photogallery.class);
                startActivity(intent);
                finish();
            }
        });
        activitiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Activities.class);
                startActivity(intent);
                finish();

            }
        });
    }
}