package com.Thread.getName;

import com.Thread.MyThread;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/22
 */
public class Demo1GetNameThread {
    public static void main(String[] args) {
        //创建Thread的子类对象
        MyThread mt=new MyThread();
        //start
        mt.start();

    }
}
