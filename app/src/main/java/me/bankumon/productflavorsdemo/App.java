package me.bankumon.productflavorsdemo;

import android.app.Application;

/**
 * App
 * Created by Bakumon on 2017/9/22.
 */

public class App extends Application {

    private static App mInstance;

    public static App getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
