package com.example.admin.myapplication.MenuFragment;


import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.myapplication.MenuFragment.Adpter.PaperAdapterinside;
import com.example.admin.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmenttuVan extends Fragment {

    View v;
    ViewPager viewPager;
    TabLayout tabLayout;
    PaperAdapterinside paperAdapterinside;

    public FragmenttuVan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_fragmenttu_van, container, false);
        anhXa();


        // Inflate the layout for this fragment
        return v;
    }
    public void anhXa() {
        viewPager = v.findViewById(R.id.view_paperinside);
        tabLayout = v.findViewById(R.id.tab_Khambenhtuxa);
        FragmentManager manager = getActivity().getSupportFragmentManager();
        paperAdapterinside = new PaperAdapterinside(manager);
        viewPager.setAdapter(paperAdapterinside);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTabsFromPagerAdapter(paperAdapterinside);
    }
}
