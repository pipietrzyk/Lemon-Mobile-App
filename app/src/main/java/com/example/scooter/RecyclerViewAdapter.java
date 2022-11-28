package com.example.scooter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    DealsFragment dealsFragment;

    public RecyclerViewAdapter(DealsFragment df, String[] name, String[] desc, int[] img) {
        dealsFragment = df;
        data1 = name;
        data2 = desc;
        images = img;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(dealsFragment.getActivity());
        View v = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.n.setText(data1[position]);
        holder.d.setText(data2[position]);
        holder.i.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView n, d;
        ImageView i;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            n = itemView.findViewById(R.id.deals_name);
            d = itemView.findViewById(R.id.deals_desc);
            i = itemView.findViewById(R.id.deals_img);
        }

    }
}
