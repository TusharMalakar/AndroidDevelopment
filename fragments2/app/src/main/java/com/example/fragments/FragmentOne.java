package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class FragmentOne extends Fragment {
    public FragmentOne() {
        // Required empty public constructor
    }




    public View onCreate(Bundle savedInstanceState, LayoutInflater inflater, ViewGroup container) {
        return  inflater.inflate(R.layout.fragment_one, container,false);
    }



}
