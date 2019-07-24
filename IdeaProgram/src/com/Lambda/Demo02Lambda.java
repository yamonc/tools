package com.Lambda;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */

/*
* lambda表达式的标准格式：
*   有三部分
*   一些参数
*   一个箭头
*   一段代码
*  格式：
*       （参数列表）->{一些重写方法的代码}
*       解释说明格式：
*   （）接口中抽象方法的参数列表：没有参数空，有就写，多个用，分割
*   ->传递的意思，把参数传递给方法体{}
*   {}重写接口的抽象方法的方法体
* */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了---");
            }
        }).start();
        //使用lambda表达式实现多线程
        new Thread(()-> {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了---");
            }
        ) .start();
        //优化省略lambda
        new Thread(()->System.out.println(Thread.currentThread().getName()+"新的线程创建了---")
        ) .start();
    }

}
