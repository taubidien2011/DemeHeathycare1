package com.example.admin.myapplication.MenuFragment.Adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.myapplication.MenuFragment.Adpter.Khambenhtuxa;
import com.example.admin.myapplication.MenuFragment.KhambenhFragment2;
import com.example.admin.myapplication.R;

import java.util.List;

public class KhambenhtuxaAdpter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Khambenhtuxa> list;

    public KhambenhtuxaAdpter(Context context, int layout, List<Khambenhtuxa> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class Viewholder {
        ImageView img;
        TextView txtname, txtgia;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        Viewholder viewholder;

        if (view == null) {
            viewholder = new Viewholder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(layout, null);
            viewholder.img = (ImageView) view.findViewById(R.id.img);
            viewholder.txtname=(TextView)view.findViewById(R.id.txtname);
            viewholder.txtgia=(TextView)view.findViewById(R.id.txtgia);
            view.setTag(viewholder);
        } else {
            viewholder = (Viewholder) view.getTag();
        }

        Khambenhtuxa khambenhtuxa = list.get(i);
        viewholder.img.setImageResource(khambenhtuxa.getHinh());
        viewholder.txtname.setText(khambenhtuxa.getName());
        viewholder.txtgia.setText(khambenhtuxa.getGia());

        return view;

    }
}
