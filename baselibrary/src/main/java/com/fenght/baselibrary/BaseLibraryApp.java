package com.fenght.baselibrary;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseLibraryApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
