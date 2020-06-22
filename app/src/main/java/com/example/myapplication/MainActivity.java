package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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

        Button btnG = (Button) findViewById(R.id.btnGet);

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RetrofitClient retrofitClient = new RetrofitClient();
                Log.e("start","2");
                Call<JsonObject> call = retrofitClient.apiService.localTest();
                call.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        Log.e("start","7");

                        Log.e("start",response.toString());
                        if(response.isSuccessful()){

                            String data = response.body().toString() ;

                            Log.e("data",data);
                        }
                    }
                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {
                        Log.e("***Error****",t.toString());
                    }
                });
                Log.e("get","success");

            }
        });

        Button btnP = (Button) findViewById(R.id.btnPost);

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestDTO testDTO = new TestDTO();

                testDTO.setData(1);

                RetrofitClient retrofitClient = new RetrofitClient();
                Call<JsonObject> call = retrofitClient.apiService.addNum(testDTO);

                call.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        try {

                            JsonObject responseJson= response.body();
                            Log.e("data",responseJson.toString());

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {
                        Log.e("***Error****",t.toString());
                    }
                });

                Log.e("post","success");
            }
        });
    }

}