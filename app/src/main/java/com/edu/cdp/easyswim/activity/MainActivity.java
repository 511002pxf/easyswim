package com.edu.cdp.easyswim.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.edu.cdp.easyswim.R;
import com.edu.cdp.easyswim.fragment.FrMain;
import com.edu.cdp.easyswim.fragment.FrMap;
import com.edu.cdp.easyswim.fragment.FrPool;
import com.edu.cdp.easyswim.fragment.FrRank;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.yokeyword.fragmentation.ISupportFragment;
import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends SupportActivity implements RadioGroup.OnCheckedChangeListener {


    @BindView(R.id.framr_layout)
    FrameLayout framrLayout;
    @BindView(R.id.rb_pool)
    RadioButton rbPool;
    @BindView(R.id.rb_map)
    RadioButton rbMap;
    @BindView(R.id.rb_rank)
    RadioButton rbRank;
    @BindView(R.id.rb_main)
    RadioButton rbMain;
    @BindView(R.id.radio_group)
    RadioGroup radioGroup;
    private FrMain frMain;
    private FrMap frMap;
    private FrRank frRank;
    private FrPool frPool;
    private int curPosition = 0;//当前显示页面下标

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //黄油刀
        ButterKnife.bind(this);
        initFragment();
        initView();
    }

    private void initView() {
        //监听用户切换导航
        radioGroup.setOnCheckedChangeListener(this);
    }


    //        加载Fragment方法
    private void initFragment() {
        if (frPool == null) {
            frMain = new FrMain();
            frMap = new FrMap();
            frRank = new FrRank();
            frPool = new FrPool();
        }

        loadMultipleRootFragment(R.id.framr_layout, 0, frPool, frMain, frMap, frRank);
    }



    //获取上一个页面的对象
    private ISupportFragment getPreFragment() {
        switch (curPosition) {
            case 0:
                return frPool;
            case 1:
                return frMap;
            case 2:
                return frRank;
            case 3:
                return frMain;
        }


        return null;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int radioButtonId) {
        switch (radioButtonId) {
            case R.id.rb_pool:
                //显示和隐藏Fr
                showHideFragment(frPool, getPreFragment());
                curPosition = 0;
                break;
            case R.id.rb_map:
                //显示和隐藏Fr
                showHideFragment(frMap, getPreFragment());
                curPosition = 1;
                break;
            case R.id.rb_rank:
                //显示和隐藏Fr
                showHideFragment(frRank, getPreFragment());
                curPosition = 2;
                break;
            case R.id.rb_main:
                //显示和隐藏Fr
                showHideFragment(frMain, getPreFragment());
                curPosition = 3;
                break;
        }
    }
}