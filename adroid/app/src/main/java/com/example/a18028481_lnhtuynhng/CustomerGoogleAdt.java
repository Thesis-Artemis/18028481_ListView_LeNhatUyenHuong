package com.example.a18028481_lnhtuynhng;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerGoogleAdt extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Google> arrayList;

    public CustomerGoogleAdt(Context ctx, int layoutItem, ArrayList<Google> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvGia= view.findViewById(R.id.txt90);
        TextView tvGoogle= view.findViewById(R.id.textGoogle);
        ImageView imgGoogle= view.findViewById(R.id.imgGoogle);

        tvGia.setText(arrayList.get(i).getTxt90());
        tvGoogle.setText(arrayList.get(i).getTextGoogle());
        imgGoogle.setImageResource(arrayList.get(i).getImgGoogle());
        return view;
    }
}
