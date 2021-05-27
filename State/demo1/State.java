package com.zjp.DesignPattern.State.demo1;

public abstract class State {
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }
    //行为1
    public abstract void handle1();
    //行为2
    public abstract void handle2();
}
