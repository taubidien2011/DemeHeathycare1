package com.example.admin.myapplication.MenuFragment;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;

import com.example.admin.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DichvuFragment2 extends Fragment {
    View v;
    CalendarView cv;
    ImageView img;
    Button btnkhamtainha,btnkhamtuxa,btncuochen;


    public DichvuFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        anhXa();
        v = inflater.inflate(R.layout.fragment_dichvu_fragment2, container, false);
        // Inflate the layout for this fragment
        return v;
    }
    public void anhXa(){
        cv = (CalendarView)v.findViewById(R.id.calendarView);
        img = (ImageView)v.findViewById(R.id.imageView);
        btnkhamtainha = (Button)v.findViewById(R.id.button6);
        btnkhamtuxa = (Button)v.findViewById(R.id.button7);
        btncuochen = (Button)v.findViewById(R.id.button8);
    }

}
