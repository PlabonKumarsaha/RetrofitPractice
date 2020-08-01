package com.example.retrofitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofitpractice.Model.Products;
import com.example.retrofitpractice.Model.retrofit.ApiInterface;
import com.example.retrofitpractice.Model.retrofit.RetrofitClient;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitClient.getRetrofitInstance().create(apiInterface.getClass());
        //fetch lists
        Call<List<Products>> call = apiInterface.getAllProduct();

        // Execute the call asynchronously. Get a positive or negative callback.
        call.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {

                // The network call was a success and we got a response
                //TODO: use the repository list and display it
                List<Products>s = response.body();
                //showing the detch data
                Gson gson = new Gson();
                String s1 = gson.toJson(s);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {

                // the network call was a failure
                // TODO: handle error
            }
        });
    }
}