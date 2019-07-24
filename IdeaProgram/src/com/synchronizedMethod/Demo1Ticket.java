package com.synchronizedMethod;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
/*
* 使用同步方法：
*   1，把访问了共享数据的代码抽取出来，放到一个方法中
*   2.在方法上添加synchronized修饰符
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
