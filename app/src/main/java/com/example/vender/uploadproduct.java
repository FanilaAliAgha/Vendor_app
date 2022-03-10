package com.example.vender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.FloatBuffer;

public class uploadproduct extends AppCompatActivity {
Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploadproduct);

        done=findViewById(R.id.done);



        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(uploadproduct.this,Dashboard.class);
                startActivity(a);
            }
        });
    }
}