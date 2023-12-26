package com.example.tree_hub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Image_Adapter01 extends BaseAdapter {
    private Context mContext;
    public Integer[] imageArray = {
            R.drawable.img_12, R.drawable.img_13, R.drawable.img_14,
            R.drawable.img_15, R.drawable.img_16, R.drawable.img_17,
            R.drawable.img_19, R.drawable.img_20
    };

    public String[] textArray = {
            "BLACK WILLOW ", "BLACK WALNUT", "TULIP TREE", "SYCAMORE",
            "WHITE SPRUCE", "RED SPRUCE", "SHADBUSH", "SASSAFRAS", "RED PINE"
    };

    public String[] textArray2 = {
            "Additional Text 1", "Additional Text 2", "Additional Text 3",
            "Additional Text 4", "Additional Text 5", "Additional Text 6",
            "Additional Text 7", "Additional Text 8"
    };

    public String[] textArray3 = {
            "Extra Info 1", "Extra Info 2", "Extra Info 3",
            "Extra Info 4", "Extra Info 5", "Extra Info 6",
            "Extra Info 7", "Extra Info 8"
    };

    public Image_Adapter01(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridItemView;

        if (convertView == null) {
            // If it's not recycled, inflate the layout
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridItemView = inflater.inflate(R.layout.maingrid_item_layout, null);
            gridItemView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            gridItemView.setPadding(6, 6, 6, 8);

            ImageView imageView6 = gridItemView.findViewById(R.id.imageView6);
            TextView textView4 = gridItemView.findViewById(R.id.textView4);
            TextView textView5 = gridItemView.findViewById(R.id.textView5);
            TextView textView6 = gridItemView.findViewById(R.id.textView6);

            // Set image and text
            imageView6.setImageResource(imageArray[position]);
            textView4.setText(textArray[position]);
            textView5.setText(textArray2[position]);
            textView6.setText(textArray3[position]);
        } else {
            gridItemView = convertView;
        }

        return gridItemView;
    }
}
