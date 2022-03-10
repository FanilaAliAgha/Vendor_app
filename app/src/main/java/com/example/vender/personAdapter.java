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

public class personAdapter extends ArrayAdapter<person> {

    private Context mContext;
    private int mResource;


    public personAdapter(@NonNull Context context, int resource, @NonNull ArrayList<person> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater= LayoutInflater.from(mContext);

        convertView= layoutInflater.inflate(mResource,parent,false);

        TextView name=convertView.findViewById(R.id.name);
        TextView message=convertView.findViewById(R.id.message);
        TextView date=convertView.findViewById(R.id.date);
        TextView time=convertView.findViewById(R.id.time);



        name.setText(getItem(position).getName());
        message.setText(getItem(position).getMessage());
        time.setText(getItem(position).getTime());
        date.setText(getItem(position).getDate());



    return convertView;
    }
}
