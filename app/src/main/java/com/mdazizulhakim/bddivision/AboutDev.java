package com.mdazizulhakim.bddivision;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutDev extends AppCompatActivity {

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dev);
        actionBar = getSupportActionBar();
        actionBar.setTitle("About Developer");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.GRAY));
    }
}
