package com.sda.adapter;

public class Display implements Data {

    public String parseData() {

        JSonData jSonData = new JSonData();
        return jSonData.json();

    }
}
