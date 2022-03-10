package com.example.vender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class manage extends AppCompatActivity {
    ListView mlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);

        mlistview=findViewById(R.id.mlistview);

        ArrayList<stock> arrayList= new ArrayList<>();

        arrayList.add(new stock("#123456","White Roses",R.drawable.ic_baseline_circlegreen,"Shipment","25/12/2020","1000","100","15"));
        arrayList.add(new stock("#234568","Rice ",R.drawable.ic_baseline_circlered,"Pending","18/12/2021","1000","200","50"));
        arrayList.add(new stock("#523652","Pizza",R.drawable.ic_baseline_circlegreen,"Processing","10/12/2021","1000","1000","95"));
        arrayList.add(new stock("#125465","Burger",R.drawable.ic_baseline_circlered,"Pending","03/12/2021","1000","1000","90"));
        arrayList.add(new stock("#789525","Fruit chart",R.drawable.ic_baseline_circlegreen,"Shipment","28/12/2021","150","200","150"));
        arrayList.add(new stock("#410412","Fruit trifel",R.drawable.ic_baseline_circlered,"Pending","31/12/2021","1000","100","25"));
        arrayList.add(new stock("#632987","Chana Chart",R.drawable.ic_baseline_circlegreen,"Processing","30/12/2021","1000","500","100"));
        arrayList.add(new stock("#856479","Pasta",R.drawable.ic_baseline_circlered,"Pending","25/12/2021","1000","57","01"));
        arrayList.add(new stock("#3221012","Lasagna",R.drawable.ic_baseline_circlegreen,"Shipment","01/12/2021","1000","150","12"));

        //custome adapter

        stockAdapter StockAdapter= new stockAdapter(this,R.layout.managelist,arrayList);
        mlistview.setAdapter(StockAdapter);

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