package com.zjp.DesignPattern.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Reflect(args);

    }

    // 反射 破坏单例模式
    private static void Reflect(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //LazyMan lazyMan = LazyMan.getInstaance();
        LazyMan lazyMan2;
            Constructor<LazyMan> constructor = LazyMan.class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            lazyMan2 = constructor.newInstance(args);

            Field zjp = LazyMan.class.getDeclaredField("zjp");
            zjp.setAccessible(true);
            zjp.set(lazyMan2, false);

            LazyMan lazyMan = constructor.newInstance(args);
            System.out.println(lazyMan);
            System.out.println(lazyMan2);
    }
}
