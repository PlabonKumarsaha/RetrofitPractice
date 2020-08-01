package com.example.retrofitpractice.Model.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static Retrofit retrofit;
    //public static Retrofit.Builder retrofit;
    public static final String API_BASE_URL = "https://api.github.com/";

    public static Retrofit getRetrofitInstance() {

        if(retrofit != null){
            retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL).addConverterFactory(
                    GsonConverterFactory.create()
            ).build();
        }
        return retrofit;
    }
}
