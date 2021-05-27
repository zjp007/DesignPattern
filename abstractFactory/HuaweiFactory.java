package com.zjp.DesignPattern.abstractFactory;

import com.zjp.DesignPattern.abstractFactory.abstractFactory.IproductorFactory;
import com.zjp.DesignPattern.abstractFactory.product.HuaweiPhone;
import com.zjp.DesignPattern.abstractFactory.product.HuaweiRouter;
import com.zjp.DesignPattern.abstractFactory.productFactory.IphoneProduct;
import com.zjp.DesignPattern.abstractFactory.productFactory.IrouterProductor;

public class HuaweiFactory implements IproductorFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IrouterProductor irouterProductor() {
        return new HuaweiRouter();
    }
}
