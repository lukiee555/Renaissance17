package com.example.lucky.renaissance17.FlowingActivities;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

import com.example.lucky.renaissance17.Alumni;
import com.example.lucky.renaissance17.Endeavour;

import com.example.lucky.renaissance17.HomeAdapter;
import com.example.lucky.renaissance17.HomeContent;
import com.example.lucky.renaissance17.Quanta;
import com.example.lucky.renaissance17.R;
import com.example.lucky.renaissance17.RecyclerTouchListener;
import com.example.lucky.renaissance17.SplashContent;
import com.example.lucky.renaissance17.Sponsors;
import com.example.lucky.renaissance17.Zarurat;
import com.mxn.soul.flowingdrawer_core.FlowingView;
import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static com.example.lucky.renaissance17.R.id.toolbar;

/**
 * Created by lucky on 05-03-2017.
 */

public class MainFlowingActivity extends AppCompatActivity implements Animation.AnimationListener {


    LeftDrawerLayout mLeftDrawerLayout;
    Toolbar toolbar;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8;
    ViewFlipper viewFlipper;


    private RecyclerView recyclerView;
    private HomeAdapter adapter;
    private List<HomeContent> albumList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flowing);

        setupToolbar();
        mLeftDrawerLayout = (LeftDrawerLayout) findViewById(R.id.id_drawerlayout);

        FragmentManager fm = getSupportFragmentManager();





        MyMenuFragment mMenuFragment = (MyMenuFragment) fm.findFragmentById(R.id.id_container_menu);
        FlowingView mFlowingView = (FlowingView) findViewById(R.id.sv);
        if (mMenuFragment == null) {
            mMenuFragment = new MyMenuFragment();
            Bundle bundle= new Bundle();
            bundle.putInt("flowingdrawer",mLeftDrawerLayout.getId());
            mMenuFragment.setArguments(bundle);
            fm.beginTransaction().add(R.id.id_container_menu,mMenuFragment).commit();
        }
        mLeftDrawerLayout.setFluidView(mFlowingView);
        mLeftDrawerLayout.setMenuFragment(mMenuFragment);





        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        i1 = (ImageView) findViewById(R.id.im1);
        i2 = (ImageView) findViewById(R.id.im2);
        i3 = (ImageView) findViewById(R.id.im3);
        i4 = (ImageView) findViewById(R.id.im4);
        i5 = (ImageView) findViewById(R.id.im5);
        i6= (ImageView) findViewById(R.id.date);
        i7= (ImageView) findViewById(R.id.tp);
        i8 = (ImageView) findViewById(R.id.money);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        anim.setAnimationListener(this);
//       i6.clearAnimation();
//        i7.clearAnimation();
//        i8.clearAnimation();
        i6.startAnimation(anim);
        i7.startAnimation(anim);
        i8.startAnimation(anim);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        final GestureDetector gestureDetector;
        gestureDetector = new GestureDetector(new MyGestureDetector());
        viewFlipper.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                if (gestureDetector.onTouchEvent(event)) {
                    return false;
                } else {
                    return true;
                }
            }
        });

        albumList = new ArrayList<>();
        adapter = new HomeAdapter(this, albumList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new MainFlowingActivity.GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                HomeContent movie = albumList.get(position);
                if (position == 0) {
                    Intent i = new Intent(getApplicationContext(), SplashContent.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(getApplicationContext(), Endeavour.class);
                    startActivity(i);

                } else if (position == 2) {
                    Intent i = new Intent(getApplicationContext(), com.example.lucky.renaissance17.Quanta.class);
                    startActivity(i);

                } else if (position == 3) {
                    Intent i = new Intent(getApplicationContext(), Alumni.class);
                    startActivity(i);

                } else if (position == 4) {
                    Intent i = new Intent(getApplicationContext(), Zarurat.class);
                    startActivity(i);
                }
                else if(position==5){
                    Intent i = new Intent(getApplicationContext(), Sponsors.class);
                    startActivity(i);

                }

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/5-min.jpg")
                .resize(300, 200)
                .placeholder(R.drawable.glry)
                .into(i1);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/8-min.jpg")
                .resize(300, 200)
                .placeholder(R.drawable.glry)
                .into(i2);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/6-min.jpg")
                .resize(300, 200)
                .placeholder(R.drawable.glry)
                .into(i3);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/25-min.jpg")
                .resize(300, 200)
                .placeholder(R.drawable.glry)
                .into(i4);
        Picasso.with(this)
                .load("http://www.jecrcrenaissance.in/event/assets/img/gallery/18-min.jpg")
                .resize(300, 200)
                .into(i5);





    }
    protected void setupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_nav_drawer);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLeftDrawerLayout.toggle();
            }
        });



    }









    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.splash,
                R.drawable.endeavour,
                R.drawable.quanta,
                R.drawable.alumni,
                R.drawable.zarurat,
                R.drawable.sponsor
        };

        HomeContent a = new HomeContent("Splash",  covers[0]);
        albumList.add(a);

        a = new HomeContent("Endeavour", covers[1]);
        albumList.add(a);

        a = new HomeContent("Quanta", covers[2]);
        albumList.add(a);

        a = new HomeContent("Alumni", covers[3]);
        albumList.add(a);

        a = new HomeContent("Zarurat",  covers[4]);
        albumList.add(a);
        a = new HomeContent("Sponser",  covers[5]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }


    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }



    class MyGestureDetector extends GestureDetector.SimpleOnGestureListener {
        Animation anim = AnimationUtils.loadAnimation(MainFlowingActivity.this, R.anim.translate);
        Animation animation = AnimationUtils.loadAnimation(MainFlowingActivity.this, R.anim.slide_out);
        private static final int SWIPE_MIN_DISTANCE = 70;
        private static final int SWIPE_MAX_OFF_PATH = 150;
        private static final int SWIPE_THRESHOLD_VELOCITY = 200;

        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            System.out.println(" in onFling() :: ");
            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
                return false;
            if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE
                    && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                viewFlipper.setInAnimation(anim);
                viewFlipper.setOutAnimation(animation);
                viewFlipper.showNext();
            } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE
                    && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                viewFlipper.setInAnimation(anim);
                viewFlipper.setOutAnimation(animation);
                viewFlipper.showPrevious();
            }
            return super.onFling(e1, e2, velocityX, velocityY);
        }
    }





}
