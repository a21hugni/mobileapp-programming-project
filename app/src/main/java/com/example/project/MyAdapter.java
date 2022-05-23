package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Verktyg> verktyg;
    public MyAdapter(List<Verktyg> verktyg) {
        this.verktyg = verktyg;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_verktyg, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id.setText(verktyg.get(position).getId());
        holder.name.setText(verktyg.get(position).getName());
        holder.location.setText(verktyg.get(position).getLocation());
        holder.company.setText(verktyg.get(position).getCompany());
        holder.size.setText(String.valueOf(verktyg.get(position).getSize()));
    }

    @Override
    public int getItemCount() {
        return verktyg.size();
    }
}
