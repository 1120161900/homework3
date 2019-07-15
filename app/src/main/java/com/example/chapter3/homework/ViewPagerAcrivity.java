package com.example.chapter3.homework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerAcrivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_acrivity);
        ViewPager viewPager = findViewById(R.id.view_pager);
        /*viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
           public Fragment getItem(int i) {
                return new HelloFragment();
            }
                @Override
                public int getCount() {
                return 3;
            }
        });*/
    }
}
