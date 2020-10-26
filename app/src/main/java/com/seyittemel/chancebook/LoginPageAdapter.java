package com.seyittemel.chancebook;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginPageAdapter extends FragmentPagerAdapter {
    private int numOfTabs;


    LoginPageAdapter(FragmentManager fm ,int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SignInFragment();
            case 1:
                return  new SignUpFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0)
            title = "Sing In";
        if(position == 1)
            title = "Sing Up";

        return  title;
    }
}
