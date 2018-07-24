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
                Layout layout = new Layout();
                return layout;
            case 1:
                Layout1 layout1 = new Layout1();
                return layout1;
            case 2:
                Layout2 layout2 = new Layout2();
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
