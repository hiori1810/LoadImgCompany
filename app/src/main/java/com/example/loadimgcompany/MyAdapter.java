package com.example.loadimgcompany;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
   private  Context mContext;
   private ArrayList<Logo> lst;

    public MyAdapter(Context mContext, ArrayList<Logo> lst) {
        this.mContext = mContext;
        this.lst=lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView , ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(convertView==null){
            gridView=new View(mContext);
            gridView=inflater.inflate(R.layout.grid_layout,null);
            TextView textView=(TextView)gridView.findViewById(R.id.grid_item_label);
            textView.setText(lst.get(position).id);
            ImageView imageView=(ImageView)gridView.findViewById(R.id.grid_item_image);
            imageView.setImageResource(lst.get(position).linkimg);
        }
        else {
            gridView=(View) convertView;
        }
        return gridView;
    }
}
