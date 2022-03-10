package com.example.vender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class orderAdapter extends ArrayAdapter<orderthings> {


    private Context mContext;
    private int mResource;
    public orderAdapter(@NonNull Context context, int resource, @NonNull ArrayList<orderthings> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater= LayoutInflater.from(mContext);

        convertView= layoutInflater.inflate(mResource,parent,false);

       ImageView pic = convertView.findViewById(R.id.pic);
        TextView cname = convertView.findViewById(R.id.cname);
        TextView odetail = convertView.findViewById(R.id.odetail);
        TextView onumber = convertView.findViewById(R.id.onumber);
        TextView date = convertView.findViewById(R.id.date);
        TextView time = convertView.findViewById(R.id.time);


        pic.setImageResource(getItem(position).getPic());
        cname.setText(getItem(position).getCname());
        odetail.setText(getItem(position).getOdetail());
        onumber.setText(getItem(position).getOnumber());
        time.setText(getItem(position).getTime());
        date.setText(getItem(position).getDate());



        return convertView;
    }
}
