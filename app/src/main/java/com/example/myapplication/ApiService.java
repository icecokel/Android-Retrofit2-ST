package com.example.myapplication;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("get/test")
    Call<JsonObject> localTest();

    @GET("menu/list")
    Call<JsonArray> getretrofitdata();

    @GET("menu/list")
    Call<JsonObject> getList();


    @GET("users/2")
    Call<JsonObject> getObj();
 // POST
    @POST("post/test")
    Call<JsonObject> addNum(@Body TestDTO testDTO);

}
