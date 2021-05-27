package com.zjp.DesignPattern.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// enum 是什么
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }
}

class TestEnum{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle enumSingle1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle enumSingle2 = declaredConstructor.newInstance();
        System.out.println(enumSingle1);
        System.out.println(enumSingle2);
    }
}