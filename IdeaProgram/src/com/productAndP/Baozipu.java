package com.productAndP;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
//生产者
public class Baozipu extends Thread {
    //1,需要在成员位置创建一个包子变量
    private Baozi baozi;

    //2，使用带参数的构造方法，为这个包子赋值
    public Baozipu(Baozi baozi) {
        this.baozi = baozi;
    }

    //设置线程任务（run）：生成包子
    @Override
    public void run() {
        //定义变量
        int count = 0;
        while (true) {
            //必须同时只能有一个线程正在执行
            synchronized (baozi) {
                //对包子的状态进行判断
                if (baozi.flag == true) {
                    //有包子
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行，包子铺生产包子  交替生产两种包子
                if (count % 2 == 0) {
                    //生产薄皮三鲜馅
                    baozi.pi = "薄皮";
                    baozi.xian = "三鲜馅";

                } else {
                    //生产冰片， 牛肉先
                    baozi.pi = "冰皮";
                    baozi.xian = "牛肉";
                }
                count++;
                System.out.println("包子铺正在生产：" + baozi.pi + baozi.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //生产好修改状态
                baozi.flag = true;
                //唤醒吃货线程,让吃货线程吃包子
                baozi.notify();

                System.out.println("包子铺已经生产好了" + baozi.pi + baozi.xian + "包子，吃货可以开吃了！");

            }
        }

    }
}
