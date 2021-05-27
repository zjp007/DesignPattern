package com.zjp.DesignPattern.factory.method;

import com.zjp.DesignPattern.factory.pojo.Car;
import com.zjp.DesignPattern.factory.pojo.WuLing;

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
