package com.example.nguyenchinh.pageviewerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int numberOfTabs;

    public PageAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                FirstFragment layout = new FirstFragment();
                return layout;
            case 1:
                SecondFragment layout1 = new SecondFragment();
                return layout1;
            case 2:
                ThirdFragment layout2 = new ThirdFragment();
                return layout2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
