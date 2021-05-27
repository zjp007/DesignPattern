package com.zjp.DesignPattern.State.demo1;

public class Test {
    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState2());
        //行为执行
        context.handle1();
        context.handle2();
    }
}
