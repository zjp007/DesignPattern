package com.zjp.DesignPattern.builder.demo02;

// 具体的建造者
public class Worker extends Builder {
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
