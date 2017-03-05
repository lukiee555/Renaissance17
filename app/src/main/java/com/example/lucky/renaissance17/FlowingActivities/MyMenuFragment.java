package com.example.lucky.renaissance17.FlowingActivities;

        import android.content.Intent;

        import android.net.Uri;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.design.widget.NavigationView;

        import android.view.LayoutInflater;
        import android.view.MenuItem;
        import android.view.View;
        import android.view.ViewGroup;


        import com.example.lucky.renaissance17.About;
        import com.example.lucky.renaissance17.Dev;
        import com.example.lucky.renaissance17.R;
        import com.example.lucky.renaissance17.Schedule;
        import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;
        import com.mxn.soul.flowingdrawer_core.MenuFragment;


public class MyMenuFragment extends MenuFragment {


    LeftDrawerLayout mLeftDrawerLayout;

    public MyMenuFragment()
    {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container,
                false);


        mLeftDrawerLayout=(LeftDrawerLayout)getActivity().findViewById(getArguments().getInt("flowingdrawer"));
          NavigationView mNavigator = (NavigationView)view.findViewById(R.id.vNavigation);
        mNavigator.setItemIconTintList(null);

        mNavigator.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                    int id = item.getItemId();

                    if (id == R.id.Schedule) {
                        Intent intent=new Intent(getContext(),Schedule.class);
                        startActivity(intent);

                    } else if (id == R.id.yt) {

                        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLysWb02uCSoP0aw_qkXlW1eqaZocn8Sml"));
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
                        Intent intent=new Intent(getContext(),About.class);
                        startActivity(intent);

                    }

                    else if (id == R.id.dev) {
                        Intent intent=new Intent(getContext(),Dev.class);
                        startActivity(intent);

                    }



                mLeftDrawerLayout.closeDrawer();
                return false;
            }
        });

        return  setupReveal(view) ;
    }


    public void onOpenMenu(){
    }
    public void onCloseMenu(){
    }
}
