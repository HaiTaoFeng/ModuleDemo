package com.fenght.moduledemo.menu;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> itemArrayList = new ArrayList<>();

    public void addItem(Item item) {
        itemArrayList.add(item);
    }

    //获取组合套餐的总价格
    public float gettotle(){
        float totle = 0;
        if (itemArrayList == null) {
            return 0.0f;
        }
        for(Item item:itemArrayList){
            totle += item.getPrice();
        }
        return totle;
    }

    public String Print(){
        StringBuilder sb = new StringBuilder();
        for (Item item:itemArrayList) {
            sb.append("\n产品为：").append(item.getName())
                    .append("\n包装为：").append(item.getPacking().getPack())
                    .append("\n价格为：").append(item.getPrice());
        }
        return sb.toString();
    }
}
