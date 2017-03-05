package com.example.lucky.renaissance17;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;


public class SplashContent extends AppCompatActivity {
   ImageButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    static int a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_content);


         String TAG = SplashContent.class.getSimpleName();

        b1=(ImageButton)findViewById(R.id.button1);
        b2=(ImageButton)findViewById(R.id.button2);
        b3=(ImageButton) findViewById(R.id.button3);
        b4=(ImageButton) findViewById(R.id.button4);
        b5=(ImageButton) findViewById(R.id.button5);
        b6=(ImageButton) findViewById(R.id.button6);
        b7=(ImageButton) findViewById(R.id.button7);
        b8=(ImageButton) findViewById(R.id.button8);
        b9=(ImageButton) findViewById(R.id.button9);
        b10=(ImageButton) findViewById(R.id.button10);
        b11=(ImageButton) findViewById(R.id.button11);
        b12=(ImageButton) findViewById(R.id.button12);
        b13=(ImageButton) findViewById(R.id.button13);
        b14=(ImageButton) findViewById(R.id.button14);
        b15=(ImageButton) findViewById(R.id.button15);
        b16=(ImageButton) findViewById(R.id.button16);



            b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=1;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=2;
                Intent i=new Intent(SplashContent.this,Information.class);

                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=3;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=4;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=5;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=6;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=7;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=8;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=9;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=10;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=11;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=12;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=13;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=14;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=15;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=16;
                Intent i=new Intent(SplashContent.this,Information.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(SplashContent.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }
}

