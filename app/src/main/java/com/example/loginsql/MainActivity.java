package com.example.loginsql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username , password , repassword;
    Button signin , signup;
    DBHelper MyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);


        signup = (Button) findViewById(R.id.btnSignUp);
        signin = (Button) findViewById(R.id.btnSignIn);
        MyDB = new DBHelper(this);




        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(MainActivity.this,"Please enter all the fields",Toast.LENGTH_SHORT).show();
                else
                {
                    if(pass.equals(repass))
                    {
                        Boolean checkuser = MyDB.checkusername(user);
                        if(checkuser==false)
                        {
                            Boolean insert = MyDB.insertdata(user,pass);
                            if(insert==true)
                            {
                                Toast.makeText(MainActivity.this,"Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(MainActivity.this,"User already exists! Please sign in", Toast.LENGTH_SHORT).show();

                            }
                        }else {
                            Toast.makeText(MainActivity.this,"Passwords not matching", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}