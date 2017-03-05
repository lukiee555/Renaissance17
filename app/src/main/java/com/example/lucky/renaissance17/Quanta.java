package com.example.lucky.renaissance17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;

public class Quanta extends AppCompatActivity {
    ImageButton b38,b39,b40,b41,b42,b43, b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37;
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanta);

        b1=(ImageButton) findViewById(R.id.button1);
        b2=(ImageButton) findViewById(R.id.button2);
        b3=(ImageButton) findViewById(R.id.button3);
        b4=(ImageButton) findViewById(R.id.button4);
        b5=(ImageButton) findViewById(R.id.button5);
        b6=(ImageButton) findViewById(R.id.button6);
        b7=(ImageButton) findViewById(R.id.button7);
        b8=(ImageButton) findViewById(R.id.button8);
        b9=(ImageButton) findViewById(R.id.button9);
        b10=(ImageButton) findViewById(R.id.button10);
        b37=(ImageButton) findViewById(R.id.button37);
        b11=(ImageButton) findViewById(R.id.button11);
        b12=(ImageButton) findViewById(R.id.button12);
        b13=(ImageButton) findViewById(R.id.button13);
        b14=(ImageButton) findViewById(R.id.button14);
        b15=(ImageButton) findViewById(R.id.button15);
        b16=(ImageButton) findViewById(R.id.button16);
        b17=(ImageButton) findViewById(R.id.button17);
        b18=(ImageButton) findViewById(R.id.button18);
        b19=(ImageButton) findViewById(R.id.button19);
        b20=(ImageButton) findViewById(R.id.button20);

        b21=(ImageButton) findViewById(R.id.button21);
        b22=(ImageButton) findViewById(R.id.button22);
        b23=(ImageButton) findViewById(R.id.button23);
        b24=(ImageButton) findViewById(R.id.button24);
        b25=(ImageButton) findViewById(R.id.button25);
        b26=(ImageButton) findViewById(R.id.button26);
        b27=(ImageButton) findViewById(R.id.button27);
        b28=(ImageButton) findViewById(R.id.button28);
        b29=(ImageButton) findViewById(R.id.button29);
        b30=(ImageButton) findViewById(R.id.button30);
        b31=(ImageButton) findViewById(R.id.button31);
        b32=(ImageButton) findViewById(R.id.button32);
        b33=(ImageButton) findViewById(R.id.button33);
        b34=(ImageButton) findViewById(R.id.button34);
        b35=(ImageButton) findViewById(R.id.button35);
        b36=(ImageButton) findViewById(R.id.button36);
        b38=(ImageButton) findViewById(R.id.button38);
        b39=(ImageButton) findViewById(R.id.button39);
        b40=(ImageButton) findViewById(R.id.button40);
        b41=(ImageButton) findViewById(R.id.button41);
        b42=(ImageButton) findViewById(R.id.button42);
        b43=(ImageButton) findViewById(R.id.button43);
        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("CS");
        spec.setContent(R.id.CS);
        spec.setIndicator("CS");
        host.addTab(spec);


        //Tab 2
        spec = host.newTabSpec("CE");
        spec.setContent(R.id.CE);
        spec.setIndicator("CE");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("EC");
        spec.setContent(R.id.EC);
        spec.setIndicator("EC");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("ME");
        spec.setContent(R.id.ME);
        spec.setIndicator("ME");
        host.addTab(spec);

        //Tab 5
        spec = host.newTabSpec("EE");
        spec.setContent(R.id.EE);
        spec.setIndicator("EE");
        host.addTab(spec);

        //Tab 6
        spec = host.newTabSpec("A.SC");
        spec.setContent(R.id.A_Sc);
        spec.setIndicator("A.SC");
        host.addTab(spec);



        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=32;
                Intent();
            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=25;
                Intent();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=26;
                Intent();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=27;
                Intent();

            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=28;
                Intent();

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=29;
                Intent();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=30;
                Intent();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=31;
                Intent();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=33;
                Intent();

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=34;
                Intent();

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=35;
                Intent();

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=36;
                Intent();

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=37;
                Intent();

            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=38;
                Intent();

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=39;
                Intent();

            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=40;
                Intent();

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=41;
                Intent();

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=42;
                Intent();

            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=43;
                Intent();

            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=44;
                Intent();

            }
        });


        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=45;
                Intent();

            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=46;
                Intent();

            }
        });
        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=47;
                Intent();

            }
        });
        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=48;
                Intent();

            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=49;
                Intent();

            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=50;
                Intent();

            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=51;
                Intent();

            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=52;
                Intent();

            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=53;
                Intent();

            }
        });

        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=54;
                Intent();

            }
        });
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=55;
                Intent();
            }
        });
        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=56;
                Intent();
            }
        });
        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=57;
                Intent();
            }
        });

        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=58;
                Intent();

            }
        });

        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=59;
                Intent();

            }
        });

        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=60;
                Intent();

            }
        });

        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=61;
                Intent();

            }
        });


        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=62;
                Intent();

            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=63;
                Intent();

            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=64;
                Intent();

            }
        });

        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=65;
                Intent();

            }
        });

        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=66;
                Intent();

            }
        });

        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SplashContent.a=67;
                Intent();

            }
        });




    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Quanta.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }


    public void Intent(){

        Intent i=new Intent(Quanta.this,Information.class);
        startActivity(i);

    }

}
