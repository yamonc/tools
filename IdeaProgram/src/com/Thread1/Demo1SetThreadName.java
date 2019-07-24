package com.Thread1;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
public class Demo1SetThreadName {
    public static void main(String[] args) {
        //开启多项成
        MyThread mt=new MyThread();
        mt.setName("xq");
        mt.start();
        new MyThread("wc").start();
    }
}
