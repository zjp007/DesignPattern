package com.zjp.DesignPattern.factory.simple;

// 静态工厂 模式
// 增加一个新的产品，如果不修改代码，做不到

import com.zjp.DesignPattern.factory.pojo.Car;
import com.zjp.DesignPattern.factory.pojo.Tesla;
import com.zjp.DesignPattern.factory.pojo.WuLing;

// 开闭原则
public class CarFactory {

    public static Car getCar(String str){
        if("WuLing".equals(str)){
            return new WuLing();
        }else if("Tesla".equals(str)){
            return new Tesla();
        }else {
            return null;
        }
    }

    public static Car getCar(Class c){
        if(c.equals(WuLing.class)){
            return new WuLing();
        }else if(c.equals(Tesla.class)){
            return new Tesla();
        }else {
            return null;
        }
    }
}
