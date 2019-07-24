package com.productAndP;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
public class Test {
    public static void main(String[] args) {
        Baozi baozi=new Baozi();
        new Baozipu(baozi).start();
        new ChiHuo(baozi).start();
    }
}
