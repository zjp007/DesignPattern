package com.zjp.DesignPattern.factory.simple;

import com.zjp.DesignPattern.factory.pojo.Car;

public class Consumer {
    public static void main(String[] args) {
        // 原来模式，了解接口、所有的实现类
        /*Car car1 = new WuLing();
        Car car2 = new Tesla();
        car1.name();
        car2.name();*/

        // 使用工厂
        Car car1 = CarFactory.getCar("WuLing");
        Car car2 = CarFactory.getCar("Tesla");
        car1.name();
        car2.name();
    }
}
