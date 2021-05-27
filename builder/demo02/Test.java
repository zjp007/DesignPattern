package com.zjp.DesignPattern.builder.demo02;

public class Test {
    public static void main(String[] args) {
        // 服务员
        Worker worker = new Worker();
        Product p = worker.builderA("全家桶").builderB("鸡翅")
                .getProduct();
        System.out.println(p);
    }
}
