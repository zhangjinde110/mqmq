package com.zjd.jimao.util.singleton;

public class Singleton {
    //懒汉模式 lazy load 懒加载 线程不安全
    private static Singleton instance;
    private Singleton(){};
    //线程安全可以加锁 synchronized ↓
    public static Singleton /*Synchronized*/ getInstance(){

        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }


}


