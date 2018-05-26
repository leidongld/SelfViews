package com.example.leidong.selfviews;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/**
 * Created by Lei Dong on 2018/5/26.
 */
public class MyApplication extends Application {
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    @SuppressLint("StaticFieldLeak")
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

        instance = this;
    }

    public static Context getContext(){
        return context;
    }

    public static MyApplication getInstance(){
        return instance;
    }
}
