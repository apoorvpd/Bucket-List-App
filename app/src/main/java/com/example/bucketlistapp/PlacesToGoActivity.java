package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;


public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        RecyclerView list = findViewById(R.id.recycler_view_places_to_go);

        BucketList[] places = {
                new BucketList("Amazon", R.drawable.amazon),
                new BucketList("Iceland", R.drawable.iceland),
                new BucketList("Japan", R.drawable.japan),
                new BucketList("Kerala", R.drawable.kerala),
                new BucketList("Vietnam", R.drawable.vietnam),

        };

        BucketListAdapter adapter = new BucketListAdapter(places);

        list.setAdapter(adapter);
    }
    }
