package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        ListView thingsToDoList = findViewById(R.id.list_view_things_to_do);

        BucketList[] things = {
                new BucketList("Kilimanjaro", R.drawable.kilimanjaro),
                new BucketList("Northern Lights", R.drawable.northern_lights),
                new BucketList("Road Trip", R.drawable.road_trip),
                new BucketList("Scuba Dive", R.drawable.scubadive),
                new BucketList("Sky Dive", R.drawable.skydive),

        };

        ArrayAdapter<BucketList> thingsToDoAdapter = new ArrayAdapter<>(
                ThingsToDoActivity.this,
                android.R.layout.simple_list_item_1,
                things
        );

        thingsToDoList.setAdapter(thingsToDoAdapter);
    }
}