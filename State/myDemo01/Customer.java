package com.zjp.DesignPattern.State.myDemo01;

public class Customer {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCurrentState(new CreateState());
        order.create();
        order.publish();
        order.accept();
        order.deal();
        order.submit();
        order.check();
        order.reback();
        order.submit();
        order.close();
    }
}
