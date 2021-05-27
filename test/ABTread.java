package com.zjp.DesignPattern.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABTread {
    // // volatile 作用：1.保证多线程共享变量的可见性（此处作用；和 锁 一样的作用）；2.禁止指令重排序优化
    private static volatile  int num=0;
    public static void main(String[] args) throws InterruptedException {

        Thread A=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (num==0){        //读取num过程记作1
                        System.out.println("A");
                        num=1;          //写入num记位2
                    }
                }
            }
        },"A");
        Thread B=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if (num==1){        //读取num过程记作3
                        System.out.println("B");
                        num=0;          ////写入num记位4
                    }
                }
            }
        },"B");
        A.start();
        B.start();
    }
    static class ABCTread {

        private static int num=0;
        private static Lock lock=new ReentrantLock();

        public static void main(String[] args) throws InterruptedException {

            Thread A=new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        lock.lock();
                        if (num==0){
                            System.out.println("A");
                            num=1;
                        }
                        lock.unlock();
                    }
                }
            },"A");
            Thread B=new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        lock.lock();
                        if (num==1){
                            System.out.println("B");
                            num=0;
                        }
                        lock.unlock();
                    }
                }
            },"B");
            A.start();
            B.start();
        }
    }

}
