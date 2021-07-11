package com.example.bucketlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.BucketListViewHolder> {

    private BucketList[] lists;

    public BucketListAdapter(BucketList[] lists) {
        this.lists = lists;
    }

    @Override
    public int getItemCount() {
        return lists.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // building the layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket, parent, false);
        return new BucketListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull BucketListAdapter.BucketListViewHolder holder, int position) {
        // for each individual item, this method will be called. And we will have access to ProjectViewHolder in question
        holder.bind(lists[position]);
    }



    static class BucketListViewHolder extends RecyclerView.ViewHolder {
        // ViewHolder is going to be the class which will hold our individual items.
        // This is a feature of the RecyclerView where they make a whole class i.e. ViewHolder class.
        // ViewHolder class holds the item layout and it basically remembers all of the views. i.e. or ImageView, TextView etc
        private ImageView image;
        private TextView name;


        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view_list_icon);
            name = itemView.findViewById(R.id.text_view_list_title);

        }

        public void bind(BucketList listItem){
            name.setText(listItem.name);
            image.setImageResource(listItem.image);
        }

    }

}
