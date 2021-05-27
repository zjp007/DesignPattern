package com.zjp.DesignPattern.adapter;

// 2、组合（对象适配器：常用）   可以实现热拔插
// 真正的适配器   需要连接USB、连接网线
public class Adapter2 implements NetToUsb {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
