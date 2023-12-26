package com.example.tree_hub;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Image_Adapter02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_adapter02);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");
        String textData = intent.getExtras().getString("textData");
        String textData2 = intent.getExtras().getString("textData2");
        String textData3 = intent.getExtras().getString("textData3");

        Image_Adapter01 imageAdapter01 = new Image_Adapter01(this);
        ImageView imageView = findViewById(R.id.imageView2);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        if (imageView != null && textView != null) {
            imageView.setImageResource(imageAdapter01.imageArray[position]);
            textView.setText(textData);
            textView2.setText(textData2);
            textView3.setText(textData3);
        } else {
            Log.e("Image_Adapter02", "ImageView or TextView is null");
        }
    }
}
