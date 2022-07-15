package com.zjd.jimao.util.singleton;


/**
 * 饿汉模式
 *
 * 执行效率高，垃圾对象多，浪费内存，没有懒加载
 *
 *
 * 可以加入双击双检锁，保持线程安全和高性能
 *
 *
 */
public class LazySingleton {

    private static LazySingleton instance = new LazySingleton();
    public LazySingleton(){};

    public static LazySingleton getInstance(){

        return instance;
    }

    /**
     * 加入双击双检索，保证多线程情况下高性能
     */
    static  class LazySynchronizedSingleon{

        private static LazySynchronizedSingleon instance;
        public LazySynchronizedSingleon(){};

        public static LazySynchronizedSingleon getInstance(){

            if (instance == null ){
                synchronized (Singleton.class){
                    if (instance == null){
                        instance = new LazySynchronizedSingleon();
                    }
                }
            }
            return instance;
        }

    }


}
