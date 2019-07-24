package com.synchronizedDemo;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
/*
* 模拟卖票案例
* 创建三个线程，同时开启，对共享的票进行出售
*
* */
public class Demo1Ticket {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
