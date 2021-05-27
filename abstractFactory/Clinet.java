package com.zjp.DesignPattern.abstractFactory;

import com.zjp.DesignPattern.abstractFactory.productFactory.IphoneProduct;
import com.zjp.DesignPattern.abstractFactory.productFactory.IrouterProductor;

public class Clinet {
    public static void main(String[] args) {
        System.out.println("===========小米系列产品===========");

        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct xiaomiPhone = xiaomiFactory.iphoneProduct();
        IrouterProductor xiaomiRouter = xiaomiFactory.irouterProductor();
        xiaomiPhone.start();
        xiaomiPhone.shutdown();
        xiaomiPhone.callup();
        xiaomiPhone.sendSMS();

        xiaomiRouter.openWifi();
        xiaomiRouter.setting();

        System.out.println("===========华为系列产品===========");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct huaweiPhone = huaweiFactory.iphoneProduct();
        IrouterProductor huaweiRouter = huaweiFactory.irouterProductor();
        huaweiPhone.start();
        huaweiPhone.shutdown();
        huaweiPhone.callup();
        huaweiPhone.sendSMS();

        huaweiRouter.openWifi();
        huaweiRouter.setting();
    }
}
