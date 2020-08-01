package com.example.retrofitpractice.Model.retrofit;

import com.example.retrofitpractice.Model.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("products.json")
    Call<List<Products>> getAllProduct();
}
