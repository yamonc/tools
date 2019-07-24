package com.Thread;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/22
 */

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println("run:"+i);
        }
    }

}
