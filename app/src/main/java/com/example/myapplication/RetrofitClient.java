package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private String localTestUrl = "http://192.168.0.7:8081/rest/";
    private String baseUrl ="http://ec2-15-165-205-186.ap-northeast-2.compute.amazonaws.com:8080/DBSG/";
    private String testUrl ="https://reqres.in/api/";

    //객체생성
    Retrofit retrofit = new Retrofit.Builder()
            //서버 url설정
            .baseUrl(localTestUrl)
            //데이터 파싱 설정
            .addConverterFactory(GsonConverterFactory.create())
            //객체정보 반환
            .build();

    public ApiService apiService = retrofit.create(ApiService.class);
}
