package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView list = findViewById(R.id.recycler_view_things_to_do);

        BucketList[] things = {
                new BucketList("Kilimanjaro", R.drawable.kilimanjaro),
                new BucketList("Northern Lights", R.drawable.northern_lights),
                new BucketList("Road Trip", R.drawable.road_trip),
                new BucketList("Scuba Dive", R.drawable.scubadive),
                new BucketList("Sky Dive", R.drawable.skydive),

        };

       BucketListAdapter adapter = new BucketListAdapter(things);

        list.setAdapter(adapter);
    }
}