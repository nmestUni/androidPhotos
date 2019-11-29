package com.example.photosapp;

public class ItemData {
    private String title;
    private String imageUrl;

    public ItemData(String title,String imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
