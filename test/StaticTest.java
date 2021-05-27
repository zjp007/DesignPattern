package com.zjp.DesignPattern.test;

public class StaticTest {
    public static Integer count = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for (int i = 0;i<3;i++){
                    count++;
                    System.out.println("thread1-->count : " + count);
                }
            }
        };

        thread1.start();
        Thread.sleep(1000);
        for (int i = 0;i<3;i++){
            count++;
            System.out.println("main-->count : " + count);
        }
    }
}

class BasicTest001{
    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            System.out.println("i = " + i);
            if (i == 6)
                break;
        }
    }
}
