package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        ListView placesToGoList = findViewById(R.id.list_view_places_to_go);

        BucketList[] places = {
                new BucketList("Amazon", R.drawable.amazon),
                new BucketList("Iceland", R.drawable.iceland),
                new BucketList("Japan", R.drawable.japan),
                new BucketList("Kerala", R.drawable.kerala),
                new BucketList("Vietnam", R.drawable.vietnam),

        };

        ArrayAdapter<BucketList> placesToGoAdapter = new ArrayAdapter<>(
                PlacesToGoActivity.this,
                android.R.layout.simple_list_item_1,
                places
        );

        placesToGoList.setAdapter(placesToGoAdapter);
    }
    }
