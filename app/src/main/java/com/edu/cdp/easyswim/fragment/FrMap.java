package com.edu.cdp.easyswim.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.edu.cdp.easyswim.R;

import me.yokeyword.fragmentation.SupportFragment;

public class FrMap extends SupportFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragement_map,container,false);
        return view;
        }
}
