package com.zjp.DesignPattern.State.myDemo01;

public class PublishState extends OrderState {
    @Override
    public void create() {

    }

    @Override
    public void publish() {
        System.out.println("订单发布！");
    }

    @Override
    public void accept() {
        System.out.println("订单被接受");
        super.order.setCurrentState(Order.acceptState);
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
        System.out.println("订单回退-->createState[创建]");
        super.order.setCurrentState(Order.createState);
    }
}
