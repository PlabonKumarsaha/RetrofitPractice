package com.example.retrofitpractice.Model;

import com.google.gson.annotations.SerializedName;

public class Products {

    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private String price;
    @SerializedName("imageUrl")
    private String imageURL;
    @SerializedName("quantity")
    private String quanity;
    @SerializedName("unit")
    private String unit;

    public Products(){

    }

    public Products(String name, String price, String imageURL, String quanity, String unit) {
        this.name = name;
        this.price = price;
        this.imageURL = imageURL;
        this.quanity = quanity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getQuanity() {
        return quanity;
    }

    public void setQuanity(String quanity) {
        this.quanity = quanity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
