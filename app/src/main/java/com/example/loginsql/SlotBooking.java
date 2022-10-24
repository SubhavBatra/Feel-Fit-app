package com.example.loginsql;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SlotBooking extends AppCompatActivity {
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
                    Toast.makeText(SlotBooking.this,"Please choose a slot",Toast.LENGTH_SHORT).show();

                }else{
                    findRadioButton(checkId);
                }
            }
        });
       /* textView = findViewById(R.id.text_view_selected);
        Button buttonApply = findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                textView.setText("Your choice: " + radioButton.getText());
            }
        });*/
    }

    private void findRadioButton(int checkId) {

        switch (checkId){
            case R.id.radio_one:
                Toast.makeText(SlotBooking.this,"you chose slot 1",Toast.LENGTH_SHORT).show();
                break;
                case R.id.radio_two:
                Toast.makeText(SlotBooking.this,"you chose slot 2",Toast.LENGTH_SHORT).show();
                break;
                case R.id.radio_three:
                Toast.makeText(SlotBooking.this,"you chose slot 3",Toast.LENGTH_SHORT).show();
                break;
                case R.id.radio_four:
                Toast.makeText(SlotBooking.this,"you chose slot 4",Toast.LENGTH_SHORT).show();


        }
    }

    /*public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),
                Toast.LENGTH_SHORT).show();*/
    } 

