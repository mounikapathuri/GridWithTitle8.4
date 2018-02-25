package com.example.mounikapathuri.gridwithtittle84;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by mounikapathuri on 24-02-2018.
 */

class CustomAdapter extends BaseAdapter {

    private Context MContext;
    private String[] mVersionName;
    private int[] mImageid;
    LayoutInflater mInfaltor;

    public CustomAdapter(MainActivity mainActivity, int[] mImages, String[] mName) {

        MContext = mainActivity;
        mVersionName=mName;
        mImageid=mImages;
        mInfaltor= (LayoutInflater) MContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mImageid.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = mInfaltor.inflate(R.layout.images,viewGroup,false);
        //getting id using view
        ImageView imageView = (ImageView) view.findViewById(R.id.versions);
        TextView textView = (TextView) view.findViewById(R.id.name);
        textView.setText(mVersionName[i]);
        imageView.setImageResource(mImageid[i]);
        return view;
    }
}
