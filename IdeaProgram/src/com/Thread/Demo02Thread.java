package com.Thread;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/22
 */
/*
* 创建多线程的第一种方式：
*   创建Thread的子类
*   java.long.Thread类：描述线程的类，我们要实现多线程程序，就必须继承Thread类
*   实现步骤：
*       1,创建一个Thread的子类
*       2.在Thread类的子类中重写Thread类中的run方法，设置线程任务
*       3，创建Thread的子类对象
*       4.调用Thread类中的方法，start 开启线程，执行run方法
*  java程序属于抢占式调度，那个线程优先级高，那个线程有限执行，同一个则随机选择
*
* */

public class Demo02Thread {
    public static void main(String[] args) {

        MyThread mt=new MyThread();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }

}
