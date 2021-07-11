package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView thingsToDoCard;
    CardView placesToGoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thingsToDoCard = findViewById(R.id.card_view_things_to_do);
        placesToGoCard = findViewById(R.id.card_view_places_to_go);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsActivityIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsActivityIntent);
            }
        });

        placesToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesActivityIntent = new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(placesActivityIntent);
            }
        });
    }
}