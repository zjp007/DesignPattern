package com.zjp.DesignPattern.factory.method;

import com.zjp.DesignPattern.factory.pojo.Car;
import com.zjp.DesignPattern.factory.pojo.Tesla;

public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
