package com.example.myapplication;


public class TestDTO{
    String keyData;
    int valueData;

    public void setValueData(int valueData) {
        this.valueData = valueData;
    }

    public void setKeyData(String keyData) {
        this.keyData = keyData;
    }

    public int getValueData() {
        return valueData;
    }

    public String getKeyData() {
        return keyData;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "keyData='" + keyData + '\'' +
                ", valueData=" + valueData +
                '}';
    }
}