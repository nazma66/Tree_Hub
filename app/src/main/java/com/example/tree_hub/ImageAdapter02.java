package com.example.tree_hub;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageAdapter02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_adapter02);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        ImageAdapter01 imageAdapter01 = new ImageAdapter01(this);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setImageResource(imageAdapter01.imageArray[position]);
    }
}
