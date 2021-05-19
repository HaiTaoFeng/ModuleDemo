package com.fenght.moduledemo.chain;

import android.os.AsyncTask;

public class Level1Log extends AbstactLog {


    public Level1Log(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Standard Console::Level1Log: " + msg);
    }
}
