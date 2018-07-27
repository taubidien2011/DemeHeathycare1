package com.example.admin.myapplication.MenuFragment;


import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.admin.myapplication.MenuFragment.Adpter.PaperAdapter;
import com.example.admin.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
     ViewPager pager;
     TabLayout tabLayout;
     FrameLayout frameLayout;
     View v;
     PaperAdapter adapter;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_blank, container, false);
        addControl();
        // Inflate the layout for this fragment
        return v;
        }
        public void addControl(){
            pager = v.findViewById(R.id.view_paper);
            tabLayout = v.findViewById(R.id.tab_layoutone);
            FragmentManager manager = getActivity().getSupportFragmentManager();
            adapter = new PaperAdapter(manager);
            pager.setAdapter(adapter);
            tabLayout.setupWithViewPager(pager);
            pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.setTabsFromPagerAdapter(adapter);
        }

    }


