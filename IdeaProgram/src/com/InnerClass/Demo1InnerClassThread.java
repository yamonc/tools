package com.InnerClass;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
public class Demo1InnerClassThread {
    public static void main(String[] args) {
        //线程父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"---->"+"黑马");
                }
            }
        }.start();

        new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"---->"+"程序员");
                }
            }
        }).start();
    }
    //接口实现方式：


}
