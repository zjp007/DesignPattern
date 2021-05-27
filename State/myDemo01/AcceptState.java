package com.zjp.DesignPattern.State.myDemo01;

public class AcceptState extends OrderState {
    @Override
    public void create() {

    }

    @Override
    public void publish() {

    }

    @Override
    public void accept() {
        System.out.println("订单被接受");
    }

    @Override
    public void deal() {
        System.out.println("订单被处理");
        super.order.setCurrentState(Order.dealState);
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
