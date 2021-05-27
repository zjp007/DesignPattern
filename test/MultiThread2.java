package com.zjp.DesignPattern.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThread2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Thread1());
        executor.submit(new Thread2());
        executor.submit(new Thread3());
        executor.shutdown();
    }

    public static class Thread1 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread1");
        }
    }

    public static class Thread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread2");
        }
    }

    public static class Thread3 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread3");
        }
    }
}
