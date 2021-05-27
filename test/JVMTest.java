package com.zjp.DesignPattern.test;

public class JVMTest {
    public static void main(String[] args) {
        // 返回虚拟机试图使用的最大内存
        long max = Runtime.getRuntime().maxMemory();
        // 返回jvm的初始化总内存
        long total = Runtime.getRuntime().totalMemory();

        System.out.println("max = " + max + "字节\t" + (max/(double)1024/1024));
        System.out.println("total = " + max + "字节\t" + (total/(double)1024/1024));
        // 默认情况下：分配的总内存是电脑内存的1/4，而初始化的内存：1/64
    }

    // OOM :
        // 1. 尝试扩大堆内存看结果
        // 2. 分析内存，看一些那个地方出现了问题（专业工具）
    //-Xms1024m -Xmx1024m -XX:+PrintGCDetails
}
