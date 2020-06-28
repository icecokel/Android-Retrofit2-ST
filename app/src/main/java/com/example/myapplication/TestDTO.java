package com.example.myapplication;


import androidx.annotation.NonNull;


// POST 시, 데이터를 보낼 DTO

public class TestDTO {
    int data;

    public void setData(int data) {
        this.data = data;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}