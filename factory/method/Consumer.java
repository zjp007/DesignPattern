package com.zjp.DesignPattern.factory.method;

import com.zjp.DesignPattern.factory.pojo.Car;

public class Consumer {
    public static void main(String[] args) {
        Car car1 = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();

        car1.name();
        car2.name();

        Car car3 = new MobaiFactory().getCar();
        car3.name();
    }
    //结构复杂度：    simple
    // 代码复杂度    simple
    // 编程复杂度：   simple
    // 管理上的复杂度  simple

    // 根据设计原则：工厂方法模式！
    // 根据实际业务：简单工厂模式！
}
