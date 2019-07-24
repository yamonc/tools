package com.Thread1;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/23
 */
/*
*  1，使用Thread类中的方法setName
*  2，创建一个带参数的构造方法，参数传递线程的名称，调用父类额代餐构造方法，把线程传给父类
* 让父类给子线程起个名字
*
* */
public class MyThread extends Thread{

    public MyThread(){

    }
    public MyThread(String name){
        super(name);//调用父类额代餐构造方法，把线程传给父类
                // 让父类给子线程起个名字
    }

    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName());
    }


}




