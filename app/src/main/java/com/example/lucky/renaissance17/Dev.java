package com.example.lucky.renaissance17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;

public class Dev extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);
        tv1=(TextView)findViewById(R.id.tv);
        tv2=(TextView)findViewById(R.id.t);

        tv1.setText("Lokesh Soni\n"+"IT 2nd Year\n"+"Mobile:9829571189");
        tv2.setText("Asmita Goswami \n"+"IT 2nd Year");

    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Dev.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }
}
