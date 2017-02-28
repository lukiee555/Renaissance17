package com.example.lucky.renaissance17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Schedule extends AppCompatActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("DAY1");
        spec.setContent(R.id.DAY1);
        spec.setIndicator("DAY1");
        host.addTab(spec);


        //Tab 2
        spec = host.newTabSpec("DAY2");
        spec.setContent(R.id.DAY2);
        spec.setIndicator("DAY2");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("DAY3");
        spec.setContent(R.id.DAY3);
        spec.setIndicator("DAY3");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("DAY4");
        spec.setContent(R.id.DAY4);
        spec.setIndicator("DAY4");
        host.addTab(spec);
    }
}
