package com.example.vender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class pendingorder extends AppCompatActivity {
    ListView plistview;


    Button upload;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendingorder);
        upload=findViewById(R.id.upload);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(pendingorder.this,uploadproduct.class);
                startActivity(a);
            }
        });


        plistview=findViewById(R.id.plistview);

        ArrayList<pending> arrayList= new ArrayList<>();

        arrayList.add(new pending(R.drawable.nuggets,"Nuggets","Nuggets by K&Ns","#987652","06/09/2021","03:30 PM"));
        arrayList.add(new pending(R.drawable.paratha,"Paratha","Dawn uncooked paratha","#554661","21/05/2021","10:15 AM"));
        arrayList.add(new pending(R.drawable.whiterose,"White ROSES","White fresh roses","#123589","30/11/2021","12:15 AM"));
        arrayList.add(new pending(R.drawable.cake,"Cake","kababjees Malt cake","#102103","15/12/2021","08:45 PM"));
        arrayList.add(new pending(R.drawable.pizza,"Pizza","Chicken Fagita flavour","#565004","09/11/2021","06:15 PM"));
        arrayList.add(new pending(R.drawable.hdabeauty,"Eye shade","Huda beauty palatte","#140689","10/01/2021","09:00 PM"));
        arrayList.add(new pending(R.drawable.dinnerset,"Dinnerset","Glass dinnerset","#100201","11/08/2021","01:23 PM"));
        arrayList.add(new pending(R.drawable.noodles,"Noodles","Knoor chatpata noodles","#906589","29/05/2021","08:00 PM"));
        arrayList.add(new pending(R.drawable.burger,"Burger","Cooked Zinger Burger","#456305","31/12/2020","01:01 AM"));
        arrayList.add(new pending(R.drawable.chips,"Chips","Unfried potato chips","#090078","17/04/2021","10:08 PM"));
        //custome adapter


        pendingAdapters PendingAdapter= new pendingAdapters(this,R.layout.pendinglist,arrayList);
        plistview.setAdapter(PendingAdapter);
























        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.home);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home:
                        return true;

                    case R.id.inbox:
                        startActivity(new Intent(getApplicationContext(), Inbox.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;


                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext(), notificationpg.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(), Setting.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                }
                return false;
            }
        });
    }
}