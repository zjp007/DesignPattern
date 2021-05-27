package com.zjp.DesignPattern.abstractFactory.abstractFactory;

import com.zjp.DesignPattern.abstractFactory.productFactory.IphoneProduct;
import com.zjp.DesignPattern.abstractFactory.productFactory.IrouterProductor;

// 抽象产品工厂
public interface IproductorFactory {

    // 生产手机
    IphoneProduct iphoneProduct();

    // 生产路由器
    IrouterProductor irouterProductor();
}
