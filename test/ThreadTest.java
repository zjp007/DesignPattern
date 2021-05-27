package com.zjp.DesignPattern.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for(int i = 0;i<10;i++){
            // 继承Thread类，重写run方法，调用start启动
            //new Thread1().start();
            // 实现Runnable接口，重写run方法，使用Thread的start方法启动
            //new Thread(new Thread2()).start();
            // 实现Callable接口，重写call方法，
            Callable<Integer> implCallable = new Thread3();
            FutureTask<Integer> futureTask = new FutureTask<Integer>(implCallable);
            new Thread(futureTask).start();
            System.out.println(Thread.currentThread().getName()+"----"+futureTask.get());
        }
    }
}

class Thread1 extends Thread{
    private static volatile  int i = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-" + i++);
    }
}

class Thread2 implements Runnable{
    private static volatile  int i = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--" + (i++));
    }
}

class Thread3 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int result = 0;
        for(int i=0;i<10;i++){
            result += i;
        }
        System.out.println(Thread.currentThread().getName());
        return result;
    }
}