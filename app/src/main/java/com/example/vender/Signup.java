package com.example.vender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
    Button confirmbtn;
    TextView alreadytxt;
    ImageView backarrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        alreadytxt= findViewById(R.id.alreadytxt);
        confirmbtn = findViewById(R.id.confirmbtn);
        backarrow=findViewById(R.id.backarrow);

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup.this,Optpage.class);
                startActivity(intent);
            }
        });



        alreadytxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Signup.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}