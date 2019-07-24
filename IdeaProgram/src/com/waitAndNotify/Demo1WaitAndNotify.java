package com.waitAndNotify;

import org.omg.CORBA.ObjectHelper;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */

/*
* 创建消费者
* */
public class Demo1WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象保证唯一
        Object object=new Object();
        //创建消费者
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒只有一个在执行
                while(true){
                    synchronized (object){
                        System.out.println("告诉老板要的包子和数量");
                        //调用wait方法进入无线等待
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码：
                        System.out.println("包子已经做好了，可以开吃了！！！");
                        System.out.println("-------------------------");
                    }
                }
            }
        }.start();
        //创建老板的线程 生产者
        new Thread(){
            @Override
            public void run() {
                //花五秒做包子
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object){
                        //唤醒
                        System.out.println("老板，五秒中之后做好包子，告知顾客可以吃包住了");
                        object.notify();
                    }

                }
            }
        };
    }
}
