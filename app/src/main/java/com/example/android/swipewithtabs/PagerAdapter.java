package com.example.android.swipewithtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.lang.String;

/**
 * Created by USER on 8/6/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter (FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            default:
                break;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "fragment1";
            case 1:
                return "fragment2";

        }
        return null;
    }
}
