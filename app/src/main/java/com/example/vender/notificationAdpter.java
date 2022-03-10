package com.example.vender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class notificationAdpter extends ArrayAdapter<notificationpg> {


    private Context mContext;
    private int mResource;
    public notificationAdpter(@NonNull Context context, int resource, @NonNull ArrayList<notificationpg> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater= LayoutInflater.from(mContext);

        convertView= layoutInflater.inflate(mResource,parent,false);

        TextView nmsg = convertView.findViewById(R.id.nmsg);
        TextView time = convertView.findViewById(R.id.time);


        nmsg.setText(getItem(position).getNmsg());
        time.setText(getItem(position).getTime());




        return convertView;
    }
}
