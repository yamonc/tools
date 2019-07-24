package com.RunnableThread;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
/*
* 创建多线程程序的第二种方式：实现Runnable
*
*
* */
public class Demo1Runnable {


    /*实现步骤：1创建Runnable的接口的实现类
    *           2.在实现类中重写Runnbale的run方法
    *           3，创建Runnable接口的实现类对象
    *           4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
    *           4.调用Thread类中start方法，开启新县城执行run方法
    *
    *   实现Runnable接口创建多线程程序的好处
    *       1，避免了单继承的局限性
    *           一个类只能继承一个类，类继成Thread类就不能阶乘比得到
    *           实现了Runable还可以继承其他类，实现其他接口
    *       2.增强了程序的扩展性，降低了程序的耦合性
    *           实现Runable接口的方式，把设置线程任务和开启新线程进行了分离
    *           实现类中，重写了run方法，用来设置线程任务
    *           创建THread类对象，调用start方法，开启了心线程的执行方法
    *
    *
    * */


    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        Thread t=new Thread(run);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

}
