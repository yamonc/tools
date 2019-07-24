package com.ThreadSleep;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
public class Demo1Sleep {
    public static void main(String[] args) throws InterruptedException {
        //模拟秒表
        for (int i = 0; i <= 60; i++) {
            System.out.println(i);
            //使用sleep
            Thread.sleep(1000);
        }
    }



}
