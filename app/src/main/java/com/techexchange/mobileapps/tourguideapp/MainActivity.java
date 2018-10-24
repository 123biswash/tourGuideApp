package com.techexchange.mobileapps.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnClickLincoln;
    Button btnClickBars;
    Button btnClickCapitol;
    Button btnClickWhiteHouse;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickLincoln = (Button) findViewById(R.id.lincoln);
        btnClickBars=(Button) findViewById(R.id.bars);
        btnClickCapitol=(Button) findViewById(R.id.capitol);
        btnClickWhiteHouse = (Button) findViewById(R.id.whitehouse);
        image = (ImageView) findViewById(R.id.simpleImageView);
        btnClickLincoln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageDrawable(getDrawable(R.drawable.lincoln));
            }
        });
        btnClickBars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageDrawable(getDrawable(R.drawable.bars));
            }
        });
        btnClickCapitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageDrawable(getDrawable(R.drawable.capitol));
            }
        });

        btnClickWhiteHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageDrawable(getDrawable(R.drawable.whitehouse));
            }
        });

    }
}
