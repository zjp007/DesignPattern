package com.zjp.DesignPattern.test;

public class BasicTest {
    public static void main(String[] args) {
        String a = "str1";
        System.out.println(a);
        String b= a;
        a += "str2";
        System.out.println(a);
        System.out.println(b);
    }
}
