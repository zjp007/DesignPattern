package com.zjp.DesignPattern.adapter;

// 客户端类：想上网，插不上网线
public class Computer {

    public void net(NetToUsb adapter){
        // 上网的具体实现，找一个转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        //电脑、适配器、网线
        Computer computer = new Computer();//电脑
        Adaptee adaptee = new Adaptee();//网线
        Adapter adapter = new Adapter();//适配器

        computer.net(adapter);

//        Computer computer2 = new Computer();//电脑
//        Adaptee adaptee2 = new Adaptee();//网线
//        Adapter2 adapter2 = new Adapter2(adaptee2);//适配器，接上网线
//
//        computer2.net(adapter2);// 电脑接上适配器
    }
}
