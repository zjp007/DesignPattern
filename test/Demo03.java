package com.zjp.DesignPattern.test;

import java.util.ArrayList;

public class Demo03 {
    byte[] array = new byte[1*1024*1024];   // 1M

    public static void main(String[] args) {
        ArrayList<Demo03> list = new ArrayList<>();
        int count = 0;
        try {
            while (true){
                list.add(new Demo03());
                count++;
            }
        }catch (Exception e){
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
