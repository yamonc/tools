package com.productAndP;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
//消费者
public class ChiHuo extends Thread {
    //1，需要在成员为主子创建一个包子变量
    private Baozi baozi;
    public ChiHuo(Baozi baozi){
        this.baozi=baozi;
    }
    //设置线程任务：生产包子
    @Override
    public void run() {
        //使用死循环，让吃货一直吃
        while(true){
            synchronized (baozi){
                if (baozi.flag=false){
                    //meiyou baozi
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后，吃包子
                System.out.println("吃货正在吃"+baozi.pi+baozi.xian+"的包子" );
                //吃货吃完包子修改包子状态为false
                baozi.flag=false;
                //唤醒包子铺线程，生产
                baozi.notify();
                System.out.println("吃货已经吃完"+baozi.pi+baozi.xian+"的包子，包子铺开始生产包子");
                System.out.println("----------------------------");
            }
        }
    }
}
