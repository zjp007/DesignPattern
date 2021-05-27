package com.zjp.DesignPattern.State.demo1;

public class Context {
    //定义状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    //当前状态
    private State currentState;

    //获得当前状态
    public State getCurrentState() {
        return currentState;
    }
    //设置当前状态
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        System.out.println("当前状态：" + currentState);
        //切换状态
        this.currentState.setContext(this);
    }
    public void handle1() {
        this.currentState.handle1();
    }
    public void handle2() {
        this.currentState.handle2();
    }
}
