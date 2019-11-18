package com.jhsf.estudo.viewpagerwithrecyclerview.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.jhsf.estudo.viewpagerwithrecyclerview.R;
import com.jhsf.estudo.viewpagerwithrecyclerview.adapter.ViewPagerAdapter;
import com.jhsf.estudo.viewpagerwithrecyclerview.view.fragment.FragmentCall;
import com.jhsf.estudo.viewpagerwithrecyclerview.view.fragment.FragmentContact;
import com.jhsf.estudo.viewpagerwithrecyclerview.view.fragment.FragmentFav;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablelayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add Fragment Here
        adapter.addFragment(new FragmentCall(),"");
        adapter.addFragment(new FragmentContact(),"");
        adapter.addFragment(new FragmentFav(),"");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Set Icons Here
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite);

    }
}
