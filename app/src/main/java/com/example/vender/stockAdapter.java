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

public class stockAdapter extends ArrayAdapter<stock> {

    private Context mContext;
    private int mResource;


    public stockAdapter(@NonNull Context context, int resource, @NonNull ArrayList<stock> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater= LayoutInflater.from(mContext);

        convertView= layoutInflater.inflate(mResource,parent,false);


        ImageView pic =convertView.findViewById(R.id.pic);
        TextView ordernumber=convertView.findViewById(R.id.ordernumber);
        TextView ordername=convertView.findViewById(R.id.ordername);
        TextView status=convertView.findViewById(R.id.status);
        TextView date=convertView.findViewById(R.id.date);
        TextView rupees=convertView.findViewById(R.id.rupees);
        TextView remqty=convertView.findViewById(R.id.remqty);
        TextView qty=convertView.findViewById(R.id.qty);







        pic.setImageResource(getItem(position).getPic());
        ordernumber.setText(getItem(position).getOrdernumber());
        ordername.setText(getItem(position).getOrdername());
        status.setText(getItem(position).getStatus());
        date.setText(getItem(position).getDate());
        rupees.setText(getItem(position).getRupees());
        qty.setText(getItem(position).getQty());
        remqty.setText(getItem(position).getRemqty());



        return convertView;
    }
}

