package com.example.tree_hub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Advice_Image_Adapter_01 extends BaseAdapter {

    private Context mContext;
    private List<AdviceItem> adviceItems;

    public Advice_Image_Adapter_01(Context c, List<AdviceItem> adviceItems) {
        mContext = c;
        this.adviceItems = adviceItems;  // Initialize the list with the provided data
    }
    public int getCount() {
        return adviceItems.size();
    }

    public Object getItem(int position) {
        return adviceItems.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View gridViewItem;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridViewItem = inflater.inflate(R.layout.grid_item_layout, null);


            gridViewItem.setLayoutParams(new GridView.LayoutParams(550, 900));
            gridViewItem.setPadding(6, 6, 6, 8);
        } else {
            gridViewItem = convertView;
        }

        ImageView imageView = gridViewItem.findViewById(R.id.imageView);
        TextView textTitle = gridViewItem.findViewById(R.id.textTitle);
        TextView textDescription = gridViewItem.findViewById(R.id.textDescription);

        AdviceItem item = adviceItems.get(position);

        imageView.setImageResource(item.getImageResource());
        textTitle.setText(item.getTitle());
        textDescription.setText(item.getDescription());

        return gridViewItem;
    }
}
