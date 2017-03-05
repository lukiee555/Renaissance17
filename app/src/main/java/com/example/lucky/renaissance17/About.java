package com.example.lucky.renaissance17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(About.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }
}
