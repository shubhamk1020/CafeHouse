package com.mastercoding.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signin_Activity extends AppCompatActivity {

    TextView  txtcreate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

     txtcreate = findViewById(R.id.createaccount);


     // For Create an account
        txtcreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signin_Activity.this,SignUp_Activity.class);
                startActivity(i);
            }
        });


   }

}