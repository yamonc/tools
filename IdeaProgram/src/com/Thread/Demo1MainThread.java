package com.Thread;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/22
 */
/*
* 主线程：执行main方法的线程
*   单线程：java程序中只有一个线程 从上到下执行
*   这个是单线程
* */
public class Demo1MainThread {
    public static void main(String[] args) {
        Person p1=new Person("xiaoQ");
        p1.run();
        //System.out.println(0/0);
        Person p2=new Person("Wang");
        p2.run();
    }
}
