package com.zjp.DesignPattern.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class MyTest {
    static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");

    public static void main(String[] args) throws ScriptException {
        //Object eval = jse.eval("2+3+4");
        //System.out.println(eval.toString());

        //ThreadLocalTest2();

        List<String> strings = toList("1,2,3,4", ",", String.class);
        Arrays.asList(strings).forEach(s->{
            System.out.println(s);
        });

        Map<String, String> map = new HashMap<>();
    }

    public static void ThreadLocalTest1 (){
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Random random = new Random();
        IntStream.range(0,5).forEach(a->new Thread(()->{
            threadLocal.set(a + " " + random.nextInt(10));
            System.out.println("set " + threadLocal.get());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());
    }

    public static void ThreadLocalTest2 (){
        ThreadLocal<String> local1 = new ThreadLocal<>();
        ThreadLocal<String> local2 = new ThreadLocal<>();
        ThreadLocal<String> local3 = new ThreadLocal<>();
        for(int i = 0;i < 5;i++){
            int finalI = i;
            new Thread(()->{
                // map.put(local1, finalI + "+" + finalI)
                local1.set( finalI + "+" + finalI);
                local2.set( finalI + "_" + finalI);
                local3.set( finalI + "*" + finalI);
                System.out.println("local1 get " + local1.get());
                System.out.println("local2 get " + local2.get());
                System.out.println("local3 get " + local3.get());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static <T> List<T> toList(String str, String splitStr,  Class<T> Class){
        List<T> result = new ArrayList<>();
        if (str != null && !"".equals(str)){
            String[] array = str.split(splitStr);
            if(array != null && array.length > 0){
                for (String s : array) {
                    result.add((T)s);
                }
            }
        }
        return  result;
    }
}
