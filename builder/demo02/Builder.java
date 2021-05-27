package com.zjp.DesignPattern.builder.demo02;

public abstract class Builder {
    abstract Builder builderA(String msg);//汉堡
    abstract Builder builderB(String msg);//可乐
    abstract Builder builderC(String msg);//薯条
    abstract Builder builderD(String msg);//甜点

    abstract Product getProduct();
}
