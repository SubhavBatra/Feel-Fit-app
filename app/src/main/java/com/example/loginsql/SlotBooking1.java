package com.example.loginsql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SlotBooking1 extends AppCompatActivity {

    RadioGroup rgLanguages;
    Button btnSubmit;
    // RadioButton radioButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgLanguages = findViewById(R.id.rgLanguages);
        btnSubmit  = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkId = rgLanguages.getCheckedRadioButtonId();
                if(checkId==-1){
                    Toast.makeText(SlotBooking1.this,"Please choose a slot",Toast.LENGTH_SHORT).show();

                }else{
                    findRadioButton(checkId);
                }
            }
        });
    }

    private void findRadioButton(int checkId) {

        switch (checkId){
            case R.id.radio_one:
                Toast.makeText(SlotBooking1.this,"you chose slot 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_two:
                Toast.makeText(SlotBooking1.this,"you chose slot 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_three:
                Toast.makeText(SlotBooking1.this,"you chose slot 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_four:
                Toast.makeText(SlotBooking1.this,"you chose slot 4",Toast.LENGTH_SHORT).show();


        }
    }
}