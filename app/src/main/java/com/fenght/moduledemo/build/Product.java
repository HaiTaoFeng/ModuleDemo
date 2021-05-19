package com.fenght.moduledemo.build;

public class Product {
    private String product = "";

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product += product;
    }

    public void printProduct(){
        System.out.println("生产的产品：" + product);
    }
}
