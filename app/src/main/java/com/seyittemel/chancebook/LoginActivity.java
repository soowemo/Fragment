package com.seyittemel.chancebook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    LoginPageAdapter pageAdapter;
    Button singUpKaydetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        viewPager = findViewById(R.id.loginViewPager);
        tabLayout = findViewById(R.id.loginTabLayout);
        singUpKaydetButton = findViewById(R.id.singUpKaydetButton);


        tabLayout.setupWithViewPager(viewPager);
        pageAdapter = new LoginPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

    }

    public void sonrakiFragment(View view){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        SingUpNextFragment singUpNextFragment = new SingUpNextFragment();
        fragmentTransaction.replace(R.id.frame_layout,singUpNextFragment);
        fragmentTransaction.commit();

    }


}
