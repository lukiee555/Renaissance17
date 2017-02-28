package com.example.lucky.renaissance17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

public class Zarurat extends AppCompatActivity {
    TabHost tabHost;
    TextView t,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zarurat);


        t=(TextView)findViewById(R.id.textView);
        b=(TextView)findViewById(R.id.textView1);
        c=(TextView)findViewById(R.id.textView2);
        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("ABOUT");
        spec.setContent(R.id.abou);
        spec.setIndicator("ABOUT");
        host.addTab(spec);


        //Tab 2
        spec = host.newTabSpec("EVENTS");
        spec.setContent(R.id.events);
        spec.setIndicator("EVENTS");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("CONTACT");
        spec.setContent(R.id.cntact);
        spec.setIndicator("CONTACT");
        host.addTab(spec);

        t.setText("Zarurat - the help beyond is a social endeavor by the JECRC foundation which focuses on imparting a healthy all round development of the underprivileged children from the nearby slum areas. Keeping up with the spirit of Renaissance, the pre-Renaissance event “Zarurat - celebrating innocence” is celebrated, seeing a footfall of 350 kids from various NGOs and 200 student volunteers.\n" +
                "The team is very fortunate to be blessed and mentored by Nobel Peace Prize Laureate Shree Kailash Satyarthi Sir, Shri Anshu Gupta, founder Goonj Foundation, Shri Lenin Raghuvanshi, founder of People's Vigilance committee on Human Rights and Ms. Gloria Benny, founder of Make a Difference who has graced the previous year's event with their benign presence.\n" +
                "Continuing the spirit of celebration, Zarurat will be organising this year's event on 7th March 2017. The event is proposed to witness the esteemed presence of Mr. Chandi Prasad Bhatt, founder Chipko Movement and Mr. Rajendra Singh, well known as waterman of India.");
        b.setText("ZUMBA DANCE : Zumba Dance is an aerobic exercise which is kept as an inaugural activity to give an energetic start to the full day event. This will be instructed by Ms. Shefali Jain, a Zumba instructor at “Shefali’s Dance and Fitness Studio” in Jaipur.\n" +
                "PRASTUTI : A platform for the kids to showcase their talent.\n" +
                "Timeless Tales with Shivangi Sharma : Shivangi Sharma is a young Story Teller from Delhi who has performed in great events like “Kracker Jack Carnival” and “Street Food Festival”, which are very well known fests in Delhi.\n" +
                "KALAKRITI : A platform for the children to go beyond their horizons and create a world of their imagination.\n" +
                "HUNGAMA : A magic show is organized for the children.\n" +
                "AWARENESS SESSION : A session organized for kids where they will be made aware of the Swachch Bharat campaign will be presented by TEAM SOCH.\n" +
                "BAL MAHOTSAV : A kids carnival for the fun and entertainment of the kids.");
        c.setText("In order to share your views and make a contribution please feel free to contact\n" +
                "Vinuj Arora: +91-9414250585 \n" +
                "Damini Malik: +91-9694943151 \n" +
                "Email: zarurat@jecrc.ac.in");
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Zarurat.this,Home.class);
        startActivity(i);
        super.onBackPressed();
    }
}
