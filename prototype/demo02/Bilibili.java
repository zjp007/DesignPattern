package com.zjp.DesignPattern.prototype.demo02;

import java.util.Date;

// 客户端 : 实现克隆
public class Bilibili {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型对象
        Video video = new Video("Java",new Date());
        System.out.println("v1=>" + video);
        System.out.println("v1=>hash: " + video.hashCode());

        // 克隆出 v2
        Video v2 = (Video) video.clone();
        v2.setName("zjp2222");
        System.out.println("v2=>" + v2);
        System.out.println("v2=>hash: " + v2.hashCode());
        System.out.println(video.getCreateTime() == v2.getCreateTime());

    }
}
