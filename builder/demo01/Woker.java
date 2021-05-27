package com.zjp.DesignPattern.builder.demo01;

// 具体的建造者
public class Woker extends Builder {
    private Product product;
    public Woker() {
        this.product = new Product();
    }
    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }
    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }
    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }
    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }
    @Override
    Product getProduct() {
        return product;
    }
}
