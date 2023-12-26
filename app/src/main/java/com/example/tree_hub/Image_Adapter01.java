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
            "Salix nigra", "Juglans nigra", "Liriodendron tulipifera",
            "Platanus occidentalis", "Picea glauca ",
            "Amelanchier canadensis",
            "Sassafras albidum",
            "Pinus resinosa"
    };

    public String[] textArray3 = {
            "Black willow is the largest and most widely distributed of the native willows, although it is rare above an altitude of 2000 feet in the Adirondacks and in the pine barrens of Long Island. It prefers moist or wet soils along streams or lakes but is sometimes found on fresh, gravelly or sandy soils where it can get plenty of light.",
            "Black walnut is a valuable timber tree native to some areas of New York State. It can reach a large size and produces highly prized wood and large edible nuts. It is common at low elevations in rich, well-drained bottomlands northward to Saratoga and Jefferson Counties and west to Lake Erie. The wood is heavy, hard, strong, durable, rich dark brown in color, easily worked, and takes a fine polish.",
            "Tulip tree is one of our most distinctive and attractive trees. It is native from Saratoga and Rensselaer Counties westward along Lake Ontario to Lake Erie, and becomes more abundant southward in deep, rich, moist soils. Its large tulip-like, greenish yellow flowers have given rise to the name \"tulip tree.\" ",

            "Sycamore is a large-sized forest tree common throughout the state except in the Adirondacks and the higher Catskills and on Long Island. This species is most often found wherever the soil is moist and fertile, along streams, in river bottoms, in low, damp woods, and occasionally in dryer places. ",
            "White spruce is confined in its natural distribution to the Adirondacks, reaching its best development in the so-called \"spruce flats,\" but extending also far up the mountain slopes. The wood is in great demand for chemical pulp.",
            "Shadbush is an attractive tree though not of value for timber because of its small size. In the spring when the shad are ascending the rivers, its small white flowers are commonly noticed along the drier banks of the streams, along fence rows, and on hillsides in open woods. ",

            "Sassafras is a small to medium-sized, shade-intolerant tree, best known, perhaps, for its bark and root which have long been used for making sassafras tea. It is rare or absent in the higher Adirondacks and Catskills but is locally common on the sandy soil between these mountain ranges, and is abundant on the hills along the lower Hudson River Valley and on Long Island. Its wood is soft, weak, brittle, coarse-grained, aromatic, and very durable in contact with the soil. It is used locally for fence posts.",
            "Red pine is a valuable, fast-growing timber tree less generally distributed than eastern white pine. It is found commonly on the sandy soils adjacent to the Adirondacks and frequently on dry benches in west-central New York. The wood is light, medium in texture, close-grained, pale red in color, and is often sold as white-pine lumber."
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
