package com.zjp.DesignPattern.State.myDemo01;

public class DealState extends OrderState {
    @Override
    public void create() {

    }

    @Override
    public void publish() {

    }

    @Override
    public void accept() {

    }

    @Override
    public void deal() {
        System.out.println("处理订单");
    }

    @Override
    public void submit() {
        System.out.println("订单提交");
        super.order.setCurrentState(Order.submitState);
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
