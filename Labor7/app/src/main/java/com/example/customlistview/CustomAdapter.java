package com.example.customlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private final String[] nameArray;
    private final String[] infoArray;
    private final Integer[] imageArray;

    public CustomAdapter(String[] nameArray, String[] infoArray, Integer[] imageArray) {
        this.nameArray = nameArray;
        this.infoArray = infoArray;
        this.imageArray = imageArray;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(nameArray[position]);
        holder.info.setText(infoArray[position]);
        holder.image.setImageResource(imageArray[position]);
    }

    @Override
    public int getItemCount() {
        return nameArray.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView name;
        final TextView info;
        final ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            info = itemView.findViewById(R.id.info);
            image = itemView.findViewById(R.id.imageView);
        }
    }
}