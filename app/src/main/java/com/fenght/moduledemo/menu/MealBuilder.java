package com.fenght.moduledemo.menu;

public class MealBuilder {

    //套餐一
    public Meal meal1(){
        Meal meal = new Meal();
        meal.addItem(new CheckenBurger());
        meal.addItem(new JuiceDrink());
        return meal;
    }
}
