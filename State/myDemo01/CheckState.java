package com.zjp.DesignPattern.State.myDemo01;

public class CheckState extends OrderState {
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

    }

    @Override
    public void check() {
        System.out.println("订单被审核");
    }

    @Override
    public void close() {
        System.out.println("订单被关闭");
        super.order.setCurrentState(Order.closeState);
    }

    @Override
    public void reback() {
        System.out.println("订单被退回-->dealState[处理中]");
        super.order.setCurrentState(Order.dealState);
    }
}
