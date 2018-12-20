package com.example.krishandev.viewpagerexample2;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager=(ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(new MyPagerAdater(getSupportFragmentManager()));
    }


    private class MyPagerAdater extends FragmentPagerAdapter {

        public MyPagerAdater(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos)
            {
                case 0:
                    return FragmentViewPager.newInstance(getString(R.string.title1), R.drawable.images2);
                case 1:
                    return FragmentViewPager.newInstance(getString(R.string.title2), R.drawable.images3);
                case 2:
                    return FragmentViewPager.newInstance(getString(R.string.title3), R.drawable.images3);
                    default:
                        return FragmentViewPager.newInstance(getString(R.string.title1), R.drawable.images2);


            }

        }

        @Override
        public int getCount() {
            return 3;
        }

    }
}
