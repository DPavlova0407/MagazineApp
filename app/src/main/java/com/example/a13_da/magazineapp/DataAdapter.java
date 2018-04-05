package com.example.a13_da.magazineapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 13_da on 05.04.2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Magazine> magazins;
    private LayoutInflater inflater;

    DataAdapter(Context context, List<Magazine> magazins){
        this.magazins = magazins;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Magazine magazine = magazins.get(position);
        holder.nameView.setText(magazine.getName());
        holder.adressView.setText(magazine.getAdress());
        holder.userView.setText(magazine.getUser());
    }

    @Override
    public int getItemCount() {
        return magazins.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        final TextView nameView, adressView, userView;
        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.item_name);
            adressView = view.findViewById(R.id.item_adress);
            userView = view.findViewById(R.id.item_user);
        }
    }
}
