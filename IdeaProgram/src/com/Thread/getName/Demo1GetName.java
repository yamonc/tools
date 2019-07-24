package com.Thread.getName;

import com.Thread1.MyThread;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/22
 *//*
* public final String getName()返回该线程的名称。
    返回：
    该线程的名称。
    * static Thread currentThread()
          返回对当前正在执行的线程对象的引用。
* */
public class Demo1GetName extends Thread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        new MyThread("wc").start();
    }

}
