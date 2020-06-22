package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("start","1");

        RetrofitClient retrofitClient = new RetrofitClient();


        Log.e("start","2");

        Call<JsonObject> call = retrofitClient.apiService.getList();

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.e("start","7");

                Log.e("start",response.toString());
                if(response.isSuccessful()){
                    Log.e("start",response.body().toString());

                    String data = response.body().toString() ;
                    
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.e("***Error****",t.toString());
            }
        });
    }

}
