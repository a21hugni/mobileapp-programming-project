package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView id;
    public TextView name;
    public TextView location;
    public TextView company;
    public TextView size;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.item_id);
        name = itemView.findViewById(R.id.item_name);
        location = itemView.findViewById(R.id.item_location);
        company = itemView.findViewById(R.id.item_company);
        size = itemView.findViewById(R.id.item_size);
    }
}
