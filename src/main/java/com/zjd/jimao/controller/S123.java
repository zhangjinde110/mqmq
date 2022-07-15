package com.zjd.jimao.controller;

import java.util.concurrent.locks.ReentrantLock;

public class S123 extends Thread {


//        public static void main(String[] args) throws InterruptedException {
//            window t1 = new window();
//            window t2 = new window();
//            window t3 = new window();
//
//            t1.setName("售票口1");
//            t2.setName("售票口2");
//            t3.setName("售票口3");
//
//            t1.start();
//            t2.start();
//            t3.start();
//
//        }
//
//    }
//
//    class window extends Thread {
//        private static int ticket = 100; //将其加载在类的静态区，所有线程共享该静态变量
//
//        @Override
//        public void run() {
//            while (true) {
//
//
//                if (ticket > 0) {
//                    try {
//                        sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(getName() + "当前售出第" + ticket + "张票");
//                    ticket--;
//
//                } else {
//                    break;
//                }
//
//            }
//        }


        public static class ThreadDemo01 {

            public static void main(String[] args) {
                window1 w = new window1();

                //虽然有三个线程，但是只有一个窗口类实现的Runnable方法，由于三个线程共用一个window对象，所以自动共用100张票

                Thread t1 = new Thread(w);
                Thread t2 = new Thread(w);
                Thread t3 = new Thread(w);

                t1.setName("窗口1");
                t2.setName("窗口2");
                t3.setName("窗口3");

                t1.start();
                t2.start();
                t3.start();
            }
        }

        static class window1 implements Runnable {

            private int ticket = 100;
            //1.实例化锁
            private ReentrantLock lock = new ReentrantLock();
            @Override
            public void run() {

                //2.调用锁定方法lock
                lock.lock();
                while (true) {
                    if (ticket > 0) {
                                        try {
                                            sleep(100);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                        System.out.println(Thread.currentThread().getName() + "当前售出第" + ticket + "张票");
                        ticket--;
                    } else {
                        break;
                    }
                }

            }

        }




    }
