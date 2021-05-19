package com.fenght.moduledemo.menu;

/**
 * 汉堡
 */
public abstract class Burger implements Item{
    @Override
    public Packing getPacking() {
        return new Wapper();
    }

    @Override
    public abstract float getPrice();
}
