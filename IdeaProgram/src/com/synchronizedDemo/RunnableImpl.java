package com.synchronizedDemo;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */

public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket=100;
    //设置买票

    //创建一个锁对象
    Object obj=new Object();

    @Override
    public void run() {

      //使用死循环，让卖票操作重复执行
        while(true){
            //同步代码块：
            synchronized (obj){
                if (ticket>0){
                    //提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(Long.parseLong("10"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }
}
