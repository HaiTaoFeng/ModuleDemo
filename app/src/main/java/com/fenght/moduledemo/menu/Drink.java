package com.fenght.moduledemo.menu;

public abstract class Drink implements Item{
    @Override
    public Packing getPacking() {
        return new Cup();
    }

    @Override
    public abstract float getPrice();
}
