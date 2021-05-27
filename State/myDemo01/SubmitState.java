package com.zjp.DesignPattern.State.myDemo01;

public class SubmitState extends OrderState {
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

    }

    @Override
    public void submit() {
        System.out.println("订单完成提交");
    }

    @Override
    public void check() {
        System.out.println("订单被审核");
        super.order.setCurrentState(Order.checkState);
    }

    @Override
    public void close() {
        System.out.println("订单被关闭");
        super.order.setCurrentState(Order.closeState);
    }

    @Override
    public void reback() {

    }
}
