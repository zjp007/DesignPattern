package com.zjp.DesignPattern.prototype.demo02;

import java.util.Date;

/**
 * 1、实现一个接口     Cloneable
 * 2、重写一个方法     clone()
 */

// 视频的类
public class Video implements Cloneable {// 无良up主，克隆别人的视频
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        // 实现深克隆
        Video video = (Video)object;
        // 将对象的属性也进行克隆
        video.setCreateTime((Date) this.createTime.clone());
        return video;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
