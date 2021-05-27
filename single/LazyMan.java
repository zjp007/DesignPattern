package com.zjp.DesignPattern.single;

// 懒汉式单例
public class LazyMan {

    private static boolean zjp = false;

    private LazyMan(){
//        if(lazyMan != null){
//            throw new RuntimeException("不要试图反射破坏单例");
//        }
        if(zjp == false){
            zjp = true;
        }else {
            throw new RuntimeException("不要试图反射破坏单例");
        }
        System.out.println(Thread.currentThread().getName() + "-->ok");
    }

    // volatile 作用：1.保证多线程共享变量的可见性；2.禁止指令重排序优化（此处用处）
    private volatile static LazyMan lazyMan;
    //双重检测锁模式的颜汉式单例     DCL懒汉式（存在问题 new）
    public static LazyMan getInstaance(){
        if(lazyMan == null){// 加一个判断，提高性能，避免其他线程等待已经初始化过的lazyMan
            synchronized (LazyMan.class){
                if(lazyMan == null){
                    lazyMan = new LazyMan();// 不是原子性操作
                    /**
                     * 1、分配内存空间
                     * 2、执行构造方法，初始化对象
                     * 3、初始化完毕的对象指向内存空间
                     * 正常   123
                     * A线程  132    没有问题
                     * B线程  获取lazyMan   此时lazyMan还没完成构造  给lazyMan加上volatile
                     */
                }
            }
        }
        return lazyMan;
    }
    // 单线程下确实ok
    // 多线程下就不是单例，需要枷锁
//    public static void main(String[] args) {
//        for (int i = 0;i < 10;i++){
//            new Thread(()->{
//                LazyMan.getInstaance();
//            }).start();
//        }
//    }
}
