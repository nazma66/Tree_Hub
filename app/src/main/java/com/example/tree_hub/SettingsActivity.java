package com.example.tree_hub;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
SearchView searchView;
ListView listview;
ArrayAdapter<String> adapter1;
    String[] productName = {"Notification Settings",
            "Display Settings",
            "Account Settings",
            "Privacy Settings",
            "Security Settings",
            "App Language",
            "Backup and Restore",
            "About App",
            "Help and Support"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        listview=findViewById(R.id.listview);
        searchView=findViewById(R.id.searchView);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(SettingsActivity.this, android.R.layout.simple_list_item_1, productName);
        listview.setAdapter(adapter1);

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter1.getFilter().filter(newText);
                return false;
            }
        });


    }
}