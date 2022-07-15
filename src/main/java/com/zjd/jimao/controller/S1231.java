package com.zjd.jimao.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class S1231 implements Callable {



    private int sum=0;//

    //可以抛出异常
    @Override
    public Object call() throws Exception {
        for(int i = 0;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum += i;
            }
        }
        return sum;
    }
}

class ThreadNew {

    public static void main(String[] args){
        //new一个实现callable接口的对象
        S1231 numThread = new S1231();

        //通过futureTask对象的get方法来接收futureTask的值
        FutureTask futureTask = new FutureTask(numThread);

        Thread t1 = new Thread(futureTask);
        t1.setName("线程1");
        t1.start();

        try {
            //get返回值即为FutureTask构造器参数callable实现类重写的call的返回值
            Object sum = futureTask.get();
            System.out.println(Thread.currentThread().getName()+":"+sum);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
