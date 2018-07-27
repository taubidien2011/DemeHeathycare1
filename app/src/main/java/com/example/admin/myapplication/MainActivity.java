package com.example.admin.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TableLayout;

import com.example.admin.myapplication.MenuFragment.BlankFragment;
import com.example.admin.myapplication.MenuFragment.CanhanFragment2;
import com.example.admin.myapplication.MenuFragment.DichvuFragment2;
import com.example.admin.myapplication.MenuFragment.GhichuFragment2;
import com.example.admin.myapplication.MenuFragment.TinnhanFragment2;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        onNavigationItemSelected();
    }
    private void onNavigationItemSelected() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_1:
                        setFragmentForTab(0);
                        return true;
                    case R.id.nav_2:
                        setFragmentForTab(1);
                        return true;
                    case R.id.nav_3:
                        setFragmentForTab(2);
                        return true;
                    case R.id.nav_4:
                        setFragmentForTab(3);
                        return true;
                    case R.id.nav_5:
                        setFragmentForTab(4);
                        return true;
                }
                return false;
            }
        });
    }

    private void setFragmentForTab(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new BlankFragment();
                break;
            case 1:
                fragment = new DichvuFragment2();

                break;
            case 2:
                fragment = new TinnhanFragment2();
                break;
            case 3:
                fragment = new GhichuFragment2();
                break;
            case 4:
                fragment = new CanhanFragment2();
                break;
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.framelayout, fragment);
            fragmentTransaction.commit();
        }
    }
    private void addControls(){
        bottomNavigationView = findViewById(R.id.navigation);
        setFragmentForTab(0);

    }
}