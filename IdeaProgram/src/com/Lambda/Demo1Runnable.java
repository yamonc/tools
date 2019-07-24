package com.Lambda;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
public class Demo1Runnable {
    public static void main(String[] args) {
        RunnableImpl runnable=new RunnableImpl();
        Thread t=new Thread(runnable);
        t.start();
        //简化代码，匿名内部类
       Runnable runnable1= new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了---");
            }
        };
       new Thread(runnable1).start();
       //继续简化
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了---");
            }
        }).start();
    }

}
