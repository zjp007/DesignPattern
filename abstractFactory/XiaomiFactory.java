package com.zjp.DesignPattern.abstractFactory;

import com.zjp.DesignPattern.abstractFactory.abstractFactory.IproductorFactory;
import com.zjp.DesignPattern.abstractFactory.product.XiaomiPhone;
import com.zjp.DesignPattern.abstractFactory.product.XiaomiRouter;
import com.zjp.DesignPattern.abstractFactory.productFactory.IphoneProduct;
import com.zjp.DesignPattern.abstractFactory.productFactory.IrouterProductor;

public class XiaomiFactory implements IproductorFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IrouterProductor irouterProductor() {
        return new XiaomiRouter();
    }
}
