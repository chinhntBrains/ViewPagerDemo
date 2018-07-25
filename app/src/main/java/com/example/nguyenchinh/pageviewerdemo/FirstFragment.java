package com.example.nguyenchinh.pageviewerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private TextView textView;
    private View fragmentView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Returning the layout file after inflating
        fragmentView = inflater.inflate(R.layout.layout, container,
                false);
        textView = (TextView) fragmentView.findViewById(R.id.textView2);
        textView.setText(R.string.tab1Content);
        return fragmentView;
    }
}
