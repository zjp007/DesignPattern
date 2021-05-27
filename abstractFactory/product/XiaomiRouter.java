package com.zjp.DesignPattern.abstractFactory.product;

import com.zjp.DesignPattern.abstractFactory.productFactory.IrouterProductor;

//小米路由器
public class XiaomiRouter implements IrouterProductor {
    @Override
    public void start() {
        System.out.println("小米路由器开机！");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机！");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开Wifi！");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置！");
    }
}
