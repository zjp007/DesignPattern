package com.zjp.DesignPattern.builder.demo01;

// 指挥：核心，之后构建一个工程，工厂如何构建，由他决定
public class Director {

    // 指挥工人安装顺序建房子
    public Product builder(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }
}
