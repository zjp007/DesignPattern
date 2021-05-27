package com.zjp.DesignPattern.State.myDemo01;

public abstract class OrderState {

    protected  Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public abstract void create();
    public abstract void publish();
    public abstract void accept();
    public abstract void deal();
    public abstract void submit();
    public abstract void check();
    public abstract void close();
    public abstract void reback();
}
