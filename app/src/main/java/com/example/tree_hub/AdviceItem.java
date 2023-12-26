package com.example.tree_hub;

public class AdviceItem {
    private int imageresource;
    private String tittle;
    private String description;

    public AdviceItem(int imageresource, String tittle, String description) {
        this.imageresource = imageresource;
        this.tittle = tittle;
        this.description = description;
    }

    public int getImageResource() {
        return imageresource;
    }

    public String getTitle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }
}

