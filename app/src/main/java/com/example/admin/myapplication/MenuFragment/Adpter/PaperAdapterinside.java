package com.example.admin.myapplication.MenuFragment.Adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.admin.myapplication.MenuFragment.FragmenttuVanTuXa;
import com.example.admin.myapplication.MenuFragment.KhambenhFragment2;

public class PaperAdapterinside extends FragmentStatePagerAdapter {
    public PaperAdapterinside(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new KhambenhFragment2();
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
                title = "Khám bệnh tai nha";
                break;
            case 1:
                title = "Tư vấn từ xa";
                break;

        }
        return title;
    }
}
