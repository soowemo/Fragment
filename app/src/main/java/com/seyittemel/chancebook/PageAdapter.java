package com.seyittemel.chancebook;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;



    PageAdapter(FragmentManager fm , int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new HomeFragment();
            case 1:
                return new AddBookFragment();
            case 2:
                return new HomeFragment();
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
