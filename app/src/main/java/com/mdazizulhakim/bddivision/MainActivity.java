package com.mdazizulhakim.bddivision;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    ListView DivisionList;
    String Division[] = {"Dhaka", "Chittagong", "Sylhet", "Rajshahi", "Khulna", "Barisal", "Mymensing", "Rangpur"};
    int DivIcon[] = {R.drawable.dhaka, R.drawable.ctg, R.drawable.syllet, R.drawable.rajshahi, R.drawable.khulna, R.drawable.barisal, R.drawable.mymansing, R.drawable.rangpur};

    Button btnTest;
    ImageView player;
    AnimationDrawable sidshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.DKGRAY));

        DivisionList = (ListView) findViewById(R.id.DivisionList);

        btnTest = (Button) findViewById(R.id.btnAbout);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutDev.class);
                startActivity(intent);
            }
        });

        player = (ImageView) findViewById(R.id.imgAnimation);
        player.setImageResource(R.drawable.frameanimation);
        sidshow = (AnimationDrawable) player.getDrawable();

        sidshow.start();

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Division, DivIcon);
        DivisionList.setAdapter(customAdapter);


        DivisionList.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });


        DivisionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Division[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DivisionDetails.class);
                intent.putExtra("Division", Division[position]);
                startActivity(intent);

            }
        });
    }
}
