package com.example.vender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Inbox extends AppCompatActivity {
    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);





        listview=findViewById(R.id.listview);

        ArrayList<person> arrayList= new ArrayList<>();

        arrayList.add(new person("Alaya","Hello me  Allaya","19/8/2021","10:45 Am"));
        arrayList.add(new person("Aleena","Hello aliza","20/10/2021","03:15 PM"));
        arrayList.add(new person("Arisha","Hello Arisha here","23/8/2021","01:30 PM"));
        arrayList.add(new person("Sara","Happy Birthday girl!","01/12/2021","12:00 Am"));
        arrayList.add(new person("Ayan","Hello,Me Ayan","13/12/2021","07:45 Pm"));
        arrayList.add(new person("Zain","Hello Zain here","29/12/2021","08:00 PM"));
        arrayList.add(new person("Afan","I am Afan Ahmed","14/9/2021","06:40 PM"));
        arrayList.add(new person("Suman","I Suman Farhan","22/12/2021","02:00 AM"));
        arrayList.add(new person("Hamza","I Hamza Ali","24/12/2021","02:02 PM"));
        arrayList.add(new person("Murtaza","I Murtaz,CR","29/12/2021","08:30 PM"));
        arrayList.add(new person("Azeem","Your teacher","15/10/2021","09:00 AM"));
        arrayList.add(new person("Qurban","Your teacher","05/12/2021","12:00 PM"));
        //custome adapter

        personAdapter PersonAdapter= new personAdapter(this,R.layout.list_item,arrayList);
        listview.setAdapter(PersonAdapter);








        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.inbox);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.inbox:
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