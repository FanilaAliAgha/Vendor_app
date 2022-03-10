package com.example.vender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class orderhistory extends AppCompatActivity {
    ListView olistview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderhistory);



        olistview=findViewById(R.id.olistview);

        ArrayList<orderthings> arrayList= new ArrayList<>();

        arrayList.add(new orderthings(R.drawable.im1,"Sara","ordered makeup palatte","#140689","10/01/2021","09:15 AM"));
        arrayList.add(new orderthings(R.drawable.im2,"Saniya","orderd White roses","#123589","30/11/2021","05:10 PM"));
        arrayList.add(new orderthings(R.drawable.im3,"Saba","Ordered Malt cake","#102103","15/12/2021","02:00 PM"));
        arrayList.add(new orderthings(R.drawable.im4,"Sabeen","Ordered Glass dinnerset","#100201","11/08/2021","03:54 PM"));
        arrayList.add(new orderthings(R.drawable.im5,"Jabeen","Ordered noodles","#906589","29/05/2021","10:55 AM"));
        arrayList.add(new orderthings(R.drawable.im6,"Javeria","Ordered Zinger Burger","#456305","31/12/2020","04:22 PM"));
        arrayList.add(new orderthings(R.drawable.im7,"Jasmine","Ordered Nuggets by K&Ns","#987652","06/09/2021","06:12 AM"));
        arrayList.add(new orderthings(R.drawable.im8,"Abeera","Ordered Pizza","#565004","09/11/2021","07:10 PM"));
        arrayList.add(new orderthings(R.drawable.im9,"Abeeha","Ordereduncooked paratha","#554661","21/05/2021","08:10 AM"));
        arrayList.add(new orderthings(R.drawable.im10,"Asif","Ordered potato chips","#090078","17/04/2021","06:12 PM"));

        //custome adapter

        orderAdapter OrderAdapter= new orderAdapter(this,R.layout.orderlist,arrayList);
        olistview.setAdapter(OrderAdapter);




















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
                        startActivity(new Intent(getApplicationContext(), Notification.class));
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