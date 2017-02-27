package com.example.lucky.renaissance17;


import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;


public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button Splash,Enda,Quanta,zarurat,alumni;
    ImageView i1,i2,i3,i4,i5;
    ViewFlipper viewFlipper;
    GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Splash=(Button)findViewById(R.id.s);
        Enda=(Button)findViewById(R.id.e);
        Quanta=(Button)findViewById(R.id.q);
        zarurat=(Button)findViewById(R.id.z);
        alumni=(Button)findViewById(R.id.al);
        i1=(ImageView)findViewById(R.id.im1);
        i2=(ImageView)findViewById(R.id.im2);
        i3=(ImageView)findViewById(R.id.im3);
        i4=(ImageView)findViewById(R.id.im4);
        i5=(ImageView)findViewById(R.id.im5);
        viewFlipper=(ViewFlipper)findViewById(R.id.viewflipper);



        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/5-min.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(200, 87)                        // optional
                .rotate(90)                             // optional
                .into(i1);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/8-min.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(200, 87)                        // optional
                .rotate(90)                             // optional
                .into(i2);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/6-min.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(200, 87)                        // optional
                .rotate(90)                             // optional
                .into(i3);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/25-min.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(200, 87)                        // optional
                .rotate(90)                             // optional
                .into(i4);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/18-min.jpg")
                .placeholder(R.mipmap.ic_launcher)   // optional
                .error(R.mipmap.ic_launcher)      // optional
                .resize(200, 87)                        // optional
                .rotate(90)                             // optional
                .into(i5);



        CustomGestureDetector customGestureDetector = new CustomGestureDetector();
        mGestureDetector = new GestureDetector(this, customGestureDetector);
        viewFlipper.setInAnimation(this, android.R.anim.fade_in);
        viewFlipper.setOutAnimation(this, android.R.anim.fade_out);


        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);






        Splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, SplashContent.class);
                startActivity(i);
            }
        });

        Enda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Endeavour.class);
                startActivity(i);
            }
        });

        Quanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Quanta.class);
                startActivity(i);
            }
        });
        zarurat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Zarurat.class);
                startActivity(i);
            }
        });
        alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Alumni.class);
                startActivity(i);
            }
        });
    }
    class CustomGestureDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

            // Swipe left (next)
            if (e1.getX() > e2.getX()) {
                viewFlipper.setInAnimation(Home.this, R.anim.left_in);
                viewFlipper.setOutAnimation(Home.this, R.anim.left_out);
                viewFlipper.showNext();
            }

            // Swipe right (previous)
            if (e1.getX() < e2.getX()) {
                viewFlipper.setInAnimation(Home.this, R.anim.right_in);
                viewFlipper.setOutAnimation(Home.this, R.anim.right_out);

                viewFlipper.showPrevious();
            }

            return super.onFling(e1, e2, velocityX, velocityY);
        }
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);

        return super.onTouchEvent(event);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }






    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Schedule) {
            Intent intent=new Intent(Home.this,Schedule.class);
            startActivity(intent);

        } else if (id == R.id.yt) {
            
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/playlist?list=PLysWb02uCSoP0aw_qkXlW1eqaZocn8Sml"));
            startActivity(i);
        }
        else if(id==R.id.fb){
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/jecrcrenaissance/"));
            startActivity(i);
        } else if(id==R.id.ig){
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/jecrcrenaissance/"));
            startActivity(i);
        }
        else if(id==R.id.tw){
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/renjecrc"));
            startActivity(i);
        }
        else if (id == R.id.about) {
            Intent intent=new Intent(Home.this,About.class);
            startActivity(intent);

        }

        else if (id == R.id.dev) {
            Intent intent=new Intent(Home.this,Dev.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
