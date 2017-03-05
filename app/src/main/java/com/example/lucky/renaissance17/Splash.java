package com.example.lucky.renaissance17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.activity_splash);
        l.clearAnimation();
        l.startAnimation(anim);


        Thread th = new Thread() {


            public void run() {

                try {
                    sleep(3000);
                } catch (Exception e) {

                }

                Intent i = new Intent(Splash.this, MainFlowingActivity.class);

                i.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(i);
                finish();
            }

        };
        th.start();

    }
}
