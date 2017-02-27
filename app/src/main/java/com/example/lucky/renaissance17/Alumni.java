package com.example.lucky.renaissance17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;

public class Alumni extends AppCompatActivity {
    TabHost tabHost;
    TextView t,c;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);


        TabHost host = (TabHost)findViewById(R.id.tabHost);
        t=(TextView)findViewById(R.id.textView);

        c=(TextView)findViewById(R.id.textView2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);


        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("ABOUT");
        spec.setContent(R.id.ABOUT);
        spec.setIndicator("ABOUT");
        host.addTab(spec);


        //Tab 2
        spec = host.newTabSpec("EVENTS");
        spec.setContent(R.id.EVENTS);
        spec.setIndicator("EVENTS");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("CONTACT");
        spec.setContent(R.id.CONTACT);
        spec.setIndicator("CONTACT");
        host.addTab(spec);

        t.setText("Time and memories hold a very special relation, both grow in exact opposite directions. It always easy to drift away from people. But one who matters should always be held close.\n" +
                "\n" +
                "This time in Renaissance we have taken this initiative to recollect, share and make memories to create a strong alumni base with our alumni who have brought laurels to the foundation. Our alumni are the custodians of our heritage and off-course are the actual Heroes of the Renaissance.");
        c.setText("For your queries regarding alumni events contact\n" +
                "\n" +
                "Sanya Khatri : 8561868161\n" +
                "Vaibhav Vijay : 9982267285");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Alumni.this,Information.class);
                startActivity(i1);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Alumni.this,Information.class);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Alumni.this,Information.class);
                startActivity(i3);
            }
        });
    }
}
