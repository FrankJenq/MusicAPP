package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //Find the View that go back to the previous screen
        ImageView back = (ImageView) findViewById(R.id.back_arrow_play);
        //Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the back arrow View is clicked on.
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
