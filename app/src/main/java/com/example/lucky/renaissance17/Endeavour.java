package com.example.lucky.renaissance17;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;

public class Endeavour extends AppCompatActivity {
   ImageButton  b9,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endeavour);
        b2=(ImageButton) findViewById(R.id.button2);
        b3=(ImageButton) findViewById(R.id.button3);
        b4=(ImageButton) findViewById(R.id.button4);
        b5=(ImageButton) findViewById(R.id.button5);
        b6=(ImageButton) findViewById(R.id.button6);
        b7=(ImageButton) findViewById(R.id.button7);
        b8=(ImageButton) findViewById(R.id.button8);
        b9=(ImageButton) findViewById(R.id.button9);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=17;
                Intent();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=18;
                Intent();

            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=19;
                Intent();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=20;
                Intent();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=21;
                Intent();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=22;
                Intent();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=23;
                Intent();

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=24;
                Intent();

            }
        });


    }
    public void Intent(){

        Intent i=new Intent(Endeavour.this,Information.class);
        startActivity(i);

    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Endeavour.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }

}
