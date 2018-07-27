package com.example.admin.myapplication.MenuFragment.Adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.admin.myapplication.MenuFragment.FragmenttuVan;
import com.example.admin.myapplication.MenuFragment.FragmenttuVanTuXa;

/**
 * Created by ADMIN on 7/10/2018.
 */

public class PaperAdapter extends FragmentStatePagerAdapter {
    public PaperAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new FragmenttuVan();
                break;
            case 1:
                frag = new FragmenttuVanTuXa();
                break;
                    }
        return frag;
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Tư vấn";
                break;
            case 1:
                title = "Hỗ trợ";
                break;

        }
        return title;
    }
}
