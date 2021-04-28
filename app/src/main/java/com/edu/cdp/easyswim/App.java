package com.edu.cdp.easyswim;

import android.app.Application;

import org.xutils.x;

import me.yokeyword.fragmentation.Fragmentation;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fragmentation.builder()
                // 显示悬浮球 ; 其他Mode:SHAKE: 摇一摇唤出   NONE：隐藏
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(BuildConfig.DEBUG)
             .install();
        //xutils初始化
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
