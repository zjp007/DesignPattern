package com.zjp.DesignPattern.abstractFactory.productFactory;

// 路由器产品接口
public interface IrouterProductor {
    void start();
    void shutdown();
    void openWifi();
    void setting();
}
