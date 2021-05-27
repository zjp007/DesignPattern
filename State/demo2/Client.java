package com.zjp.DesignPattern.State.demo2;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        //定义初始状态为关门（共四种初始值）
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
