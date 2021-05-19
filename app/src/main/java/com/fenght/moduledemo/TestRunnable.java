package com.fenght.moduledemo;

public class TestRunnable extends Thread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
