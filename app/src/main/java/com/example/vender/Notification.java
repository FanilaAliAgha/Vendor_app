package com.example.vender;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {
    ListView nlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);



        nlistview=findViewById(R.id.nlistview);

        ArrayList<notificationpg> arrayList= new ArrayList<>();

        arrayList.add(new notificationpg("A new message from Sana","06/11/2021"));
        arrayList.add(new notificationpg("A new message from Sara","10/08/2021"));
        arrayList.add(new notificationpg("A new message from Ali","08/08/2021"));
        arrayList.add(new notificationpg("A new message from Aliza","09/11/2021"));
        arrayList.add(new notificationpg("A new message from Hania","11/11/2021"));
        arrayList.add(new notificationpg("A new message from Hiba","12/11/2021"));
        arrayList.add(new notificationpg("A new message from Amna","13/05/2021"));
        arrayList.add(new notificationpg("A new message from Fazila","14/08/2021"));
        arrayList.add(new notificationpg("A new message from Shafaq","15/09/2021"));
        arrayList.add(new notificationpg("A new message from Aiman","16/10/2021"));
        arrayList.add(new notificationpg("A new message from Fazeen","17/09/2021"));
        arrayList.add(new notificationpg("A new message from Mariam","18/10/2021"));


        //custome adapter


        notificationAdpter NotificationAdapter= new notificationAdpter(this,R.layout.notificationlist,arrayList);
        nlistview.setAdapter(NotificationAdapter);

















        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.notification);


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
                        startActivity(new Intent(getApplicationContext(), Inbox.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;


                    case R.id.notification:
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