package com.fenght.moduledemo.build;

/**
 * 生产披萨
 */
public class PisaBuilder extends Builder{
    private Product product = new Product();

    @Override
    void builderA() {
        product.setProduct("榴莲披萨");
    }

    @Override
    void budlderB() {
        product.setProduct("至尊披萨");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
