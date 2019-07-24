package com.lambdaDemo;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
public class Demo1Cook {


    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃放了");
            }
        });
       // 使用lambda表达式
        invokeCook(()->{
            System.out.println("吃饭了");
        });
        //省略lambda
        invokeCook(()->System.out.println("吃饭了"));
    }
    //定义方法，参数传递cook接口，方法内部调用cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }

}
