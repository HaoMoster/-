package com.example.lenovo.roomshulvyou.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lenovo.roomshulvyou.R;
import com.example.lenovo.roomshulvyou.ui.bean.Person;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/1/30.
 */

public class MyApterList extends BaseAdapter {
    private ArrayList<Person> list;
    Context context;

    public MyApterList(ArrayList<Person> list, Context context) {
        this.list = list;
        this.context = context;
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

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
view= LayoutInflater.from(context).inflate(R.layout.text,null);
        TextView nn = view.findViewById(R.id.nnn);
        nn.setText(list.get(i).getName());
        return view;
    }
}
