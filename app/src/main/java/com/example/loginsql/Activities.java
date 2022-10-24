package com.example.loginsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activities extends AppCompatActivity {

    public Button workout,yoga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        workout = (Button) findViewById(R.id.workoutBtn);
        yoga = (Button) findViewById(R.id.poweryogaBtn);

        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activities.this,SlotBooking1.class);
                startActivity(intent);
                finish();
            }
        });
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activities.this,SlotBooking1.class);
                startActivity(intent);
                finish();
            }
        });
    }
}