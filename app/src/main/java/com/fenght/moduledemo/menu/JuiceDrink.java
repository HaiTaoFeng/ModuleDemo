package com.fenght.moduledemo.menu;

/**
 * 果汁
 */
public class JuiceDrink extends Drink {

    @Override
    public String getName() {
        return "果汁";
    }

    @Override
    public float getPrice() {
        return 5.00f;
    }
}
