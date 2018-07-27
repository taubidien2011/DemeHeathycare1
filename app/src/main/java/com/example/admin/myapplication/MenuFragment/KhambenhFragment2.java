package com.example.admin.myapplication.MenuFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.example.admin.myapplication.MenuFragment.Adpter.Khambenhtuxa;
import com.example.admin.myapplication.MenuFragment.Adpter.KhambenhtuxaAdpter;
import com.example.admin.myapplication.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KhambenhFragment2 extends Fragment {
    View v;
    GridView gv;
    ArrayList<Khambenhtuxa> arrayList;
    KhambenhtuxaAdpter adapter;


    public KhambenhFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_khambenh_fragment2, container, false);
        addControl();

        adapter = new KhambenhtuxaAdpter(getActivity().getApplicationContext(),R.layout.item_khambenhtuxa,arrayList);
        gv.setAdapter(adapter);
        // Inflate the layout for this fragment
        return v;
    }
    public void addControl(){
        gv = (GridView) v.findViewById(R.id.gv);
        arrayList = new ArrayList<>();
        arrayList.add(new Khambenhtuxa("Khám sức khỏe tổng quát",R.drawable.a11,"100.000đ"));
        arrayList.add(new Khambenhtuxa("Tiểu đường",R.drawable.a12,"100.000đ"));
        arrayList.add(new Khambenhtuxa("Tim mạch và huyết áp",R.drawable.a13,"100.000đ"));
        arrayList.add(new Khambenhtuxa("Nhi khoa",R.drawable.a14,"100.000đ"));




    }

}
