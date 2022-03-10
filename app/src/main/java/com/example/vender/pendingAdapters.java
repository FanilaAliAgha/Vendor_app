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

public class pendingAdapters extends ArrayAdapter<com.example.vender.pending> {


    private Context mContext;
    private int mResource;
    public pendingAdapters(@NonNull Context context, int resource, @NonNull ArrayList<com.example.vender.pending> objects) {
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
        TextView pname = convertView.findViewById(R.id.pname);
        TextView pdetail = convertView.findViewById(R.id.pdetail);
        TextView pnumber = convertView.findViewById(R.id.pnumber);
        TextView date = convertView.findViewById(R.id.date);
        TextView time = convertView.findViewById(R.id.time);


        pic.setImageResource(getItem(position).getPic());
        pname.setText(getItem(position).getPname());
        pdetail.setText(getItem(position).getPdetail());
        pnumber.setText(getItem(position).getPnumber());
        time.setText(getItem(position).getTime());
        date.setText(getItem(position).getDate());



        return convertView;
    }
}
