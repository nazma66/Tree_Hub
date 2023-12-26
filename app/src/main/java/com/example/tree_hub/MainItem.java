package com.example.tree_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainItem  {
    private int imagemaino;
    private String name;
    private String scinameo;

    public MainItem(int imagemain0, String name, String scinameo) {
        this.imagemaino = imagemaino;
        this.name = name;
        this.scinameo = scinameo;
    }

    public int getImagemain() {
        return imagemaino;
    }

    public String getName() {
        return  name;
    }

    public String getSciname() {
        return scinameo;
    }
}
