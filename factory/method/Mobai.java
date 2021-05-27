package com.zjp.DesignPattern.factory.method;

import com.zjp.DesignPattern.factory.pojo.Car;

public class Mobai implements Car {
    @Override
    public void name() {
        System.out.println("摩拜单车！");
    }
}
