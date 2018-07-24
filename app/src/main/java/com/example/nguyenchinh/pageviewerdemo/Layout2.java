package com.example.nguyenchinh.pageviewerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Layout2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Returning the layout file after inflating
        return inflater.inflate(R.layout.layout3, container, false);
    }
}
