package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the music list
        TextView list = (TextView) findViewById(R.id.start_screen_list);
        //Set a click listener on that View
        list.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the list View is clicked on.
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(listIntent);
            }
        });

        //Find the View that shows the search result
        TextView searchResult = (TextView) findViewById(R.id.start_screen_search);
        //Set a click listener on that View
        searchResult.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchResultIntent = new Intent(MainActivity.this,SearchResultActivity.class);
                startActivity(searchResultIntent);
            }
        });

        //Find the View that shows the settings
        TextView settings = (TextView) findViewById(R.id.start_screen_settings);
        //Set a click listener on that View
        settings.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });
    }
}
