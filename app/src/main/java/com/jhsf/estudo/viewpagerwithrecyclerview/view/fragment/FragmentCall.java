package com.jhsf.estudo.viewpagerwithrecyclerview.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jhsf.estudo.viewpagerwithrecyclerview.R;

public class FragmentCall extends Fragment {

    View v;

    public FragmentCall() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.call_fragment, container, false);
        return v;
    }



}
