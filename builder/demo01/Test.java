package com.zjp.DesignPattern.builder.demo01;

public class Test {
    public static void main(String[] args) {
        // 指挥
        Director director = new Director();

        System.out.println(director.builder(new Woker()));
    }
}
