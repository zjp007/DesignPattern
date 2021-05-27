package com.zjp.DesignPattern.factory.method;

import com.zjp.DesignPattern.factory.pojo.Car;

public class MobaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Mobai();
    }
}
