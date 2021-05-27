package com.zjp.DesignPattern.factory.simple;

import com.zjp.DesignPattern.factory.pojo.Car;

public class DaZhong implements Car {
    @Override
    public void name() {
        System.out.println("大众！");
    }
}
