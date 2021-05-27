package com.zjp.DesignPattern.State.demo1;

public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        System.out.println("ConcreteState1 的 handle1 方法");
    }

    @Override
    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        System.out.println("ConcreteState1 的 handle2 方法");
    }
}
