package com.example.tree_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Main_GridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid_view);

//setTitle("GridViewActivity");

        GridView gridView =(GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new Image_Adapter01(this) );
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent( Main_GridView.this,Image_Adapter02.class);
                i.putExtra("id", position);
                i.putExtra("textData", ((Image_Adapter01) parent.getAdapter()).textArray[position]);
                i.putExtra("textData2", ((Image_Adapter01) parent.getAdapter()).textArray2[position]);
                i.putExtra("textData3", ((Image_Adapter01) parent.getAdapter()).textArray3[position]);
                startActivity(i);
            }
        });

    }
}