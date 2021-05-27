package com.zjp.DesignPattern.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LazyMan {

    /* 针对第二次反射破坏
    private LazyMan(){
        System.out.println(Thread.currentThread().getName() + "-->线程");
    }
    修改为
    private LazyMan(){
        if(LAZY_MAN != null){
            throw new RuntimeException("不要视图反射破坏单例！");
        }
     针对第三次破坏，新增私有变量控制，修改为如下
    }
     */
    private static boolean zjp = false;
    private LazyMan(){
        if(zjp == false){
            zjp = true;
        }else {
            throw new RuntimeException("不要视图反射破坏单例！");
        }
        System.out.println(Thread.currentThread().getName() + "-->线程");
    }

    private static LazyMan LAZY_MAN  = null;

    /*最初
    public static LazyMan newInstance(){
        if(LAZY_MAN == null){
            return new LazyMan();
        }
        return LAZY_MAN;
    }
    */

    //针对第一次破坏，双重校验锁，保证单例
        // 写法一（推荐，性能高）
        public static LazyMan newInstance(){
            if(LAZY_MAN == null){
                synchronized (LazyMan.class){
                    if(LAZY_MAN == null){
                        LAZY_MAN = new LazyMan();
                    }
                }
            }
            return LAZY_MAN;
        }
        //写法二
        /*public static synchronized LazyMan newInstance(){
            if(LAZY_MAN == null){
                LAZY_MAN = new LazyMan();
            }
            return LAZY_MAN;
        }*/
}

class LazyTest{
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        // 第一次通过 多线程 破坏单例模式
        //FirstTestSingle();

        // 第二次破坏，通过反射
        //SecondTestSingle();

        // 第三次 破坏，通过反射
        //ThirdTestSingle();

        // 第四次破坏，反射
        FouceTestSingle();
    }

    //第一次通过多线程破坏单例模式
    private static void FirstTestSingle() {
        for (int i = 0;i < 10;i++){
            new Thread(()->{
                System.out.println(LazyMan.newInstance());
            }).start();
        }
    }

    // 第二次破坏，通过反射
    private static void SecondTestSingle() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazyMan lazyMan1 = LazyMan.newInstance();

        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyMan lazyMan2 = declaredConstructor.newInstance();

        System.out.println(lazyMan1);
        System.out.println(lazyMan2);
    }

    // 第三次破坏，反射
    private static void ThirdTestSingle() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyMan lazyMan2 = declaredConstructor.newInstance();
        LazyMan lazyMan1 = declaredConstructor.newInstance();
        //或
        //LazyMan lazyMan1 = LazyMan.newInstance();

        System.out.println(lazyMan1);
        System.out.println(lazyMan2);
    }

    // 第四次破坏
    private static void FouceTestSingle() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        LazyMan lazyMan2 = declaredConstructor.newInstance();

        Field field = LazyMan.class.getDeclaredField("zjp");
        field.setAccessible(true);
        field.set(lazyMan2, false);
        LazyMan lazyMan1 = declaredConstructor.newInstance();
        //或
        //LazyMan lazyMan1 = LazyMan.newInstance();

        System.out.println(lazyMan1);
        System.out.println(lazyMan2);
    }
}