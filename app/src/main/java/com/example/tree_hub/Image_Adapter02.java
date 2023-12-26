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

        Image_Adapter01 imageAdapter01 = new Image_Adapter01(this);
        ImageView imageView = findViewById(R.id.imageView2);
        TextView textView = findViewById(R.id.textView);

        if (imageView != null && textView != null) {
            imageView.setImageResource(imageAdapter01.imageArray[position]);
            textView.setText(textData);
        } else {
            Log.e("Image_Adapter02", "ImageView or TextView is null");
        }
    }
}
