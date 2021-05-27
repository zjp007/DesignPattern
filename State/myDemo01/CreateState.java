package com.zjp.DesignPattern.State.myDemo01;

public class CreateState extends OrderState {
    @Override
    public void create() {
        System.out.println("订单创建！");
    }

    @Override
    public void publish() {
        System.out.println("订单发布！");
        super.order.setCurrentState(Order.publishState);
    }

    @Override
    public void accept() {

    }

    @Override
    public void deal() {

    }

    @Override
    public void submit() {

    }

    @Override
    public void check() {

    }

    @Override
    public void close() {

    }

    @Override
    public void reback() {

    }
}
