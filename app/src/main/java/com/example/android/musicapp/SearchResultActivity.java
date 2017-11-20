package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        //Find the View that go back to the main screen
        ImageView back = (ImageView) findViewById(R.id.back_arrow_search_result);
        //Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the back arrow View is clicked on.
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(SearchResultActivity.this,MainActivity.class);
                startActivity(backIntent);
            }
        });

        //Find the View that shows the detail screen
        TextView musicDetail = (TextView) findViewById(R.id.music_detail);
        //Set a click listener on that View
        musicDetail.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the music name View is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicDetailIntent = new Intent(SearchResultActivity.this,DetailActivity.class);
                startActivity(musicDetailIntent);
            }
        });

        //Find the View that shows the play screen
        ImageView play = (ImageView) findViewById(R.id.play_arrow);
        //Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the music play View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(SearchResultActivity.this,PlayActivity.class);
                startActivity(playIntent);
            }
        });
    }
}
