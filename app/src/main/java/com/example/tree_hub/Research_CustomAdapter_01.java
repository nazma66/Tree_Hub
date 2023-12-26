package com.example.tree_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Research_CustomAdapter_01 extends BaseAdapter {
    private final String[] buttonLinks;

    private final Activity context;
    private final String[] resheadline;
    private final Integer[] resimageId;
    private final String[] resdate;
    private final String[] resdetails;

    public Research_CustomAdapter_01(Activity context, String[] resheadline, Integer[] resimageId, String[] resdate, String[] resdetails,String[] buttonLinks) {
        this.context = context;
        this.resheadline = resheadline;
        this.resimageId = resimageId;
        this.resdate = resdate;
        this.resdetails = resdetails;
        this.buttonLinks = buttonLinks;
    }

    public int getCount() {
        return resheadline.length;
    }


    public Object getItem(int position) {
        return resheadline[position];
    }

    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null) {
            LayoutInflater inflator = LayoutInflater.from(context);

            convertView = inflator.inflate(R.layout.activity_research_custom_adapter01, null, true);

            vh= new ViewHolder(convertView);
            convertView.setTag(vh);
        }
        else {
            vh=(ViewHolder) convertView.getTag();
        }


        vh.text01_res.setText(resheadline[position]);
        vh.image_res.setImageResource(resimageId[position]);
        vh.text02_res.setText(resdate[position]);

        vh.text03_res.setText(resdetails[position]);
        vh.button_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the corresponding URL when the button is clicked
                String link = buttonLinks[position];
                if (link != null && !link.isEmpty()) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                    context.startActivity(browserIntent);
                }
            }
        });

        return convertView;
    }

    private class ViewHolder {
        TextView text01_res,text02_res,text03_res;
        ImageView image_res;
        TextView button_res;

        public ViewHolder(View view) {
            text01_res= (TextView) view.findViewById(R.id.text01_res);
            image_res = (ImageView) view.findViewById(R.id.image_res);
            text02_res= (TextView) view.findViewById(R.id.text02_res);
            text03_res= (TextView) view.findViewById(R.id.text03_res);
            button_res = view.findViewById(R.id.button_res);

        }
    }
}



