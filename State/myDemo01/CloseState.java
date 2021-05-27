package com.zjp.DesignPattern.State.myDemo01;

public class CloseState extends OrderState {
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

    }

    @Override
    public void close() {
        System.out.println("订单被关闭");
    }

    @Override
    public void reback() {

    }
}
