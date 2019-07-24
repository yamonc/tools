package com.lambdaDemo1;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
public class Demo1Calculator {
    public static void main(String[] args) {
        //调用invakeCalc方法，参数是接口，可以使用匿名内部类

        invokeCalc(10, 20, new Calculate() {
            @Override
            public int calc(int a, int b) {
                return  a+b;
            }
        });
        //使用lambda表达式简化匿名内部类的书写
       invokeCalc(10,20,(int a,int b)->{
           return a+b;
       });



       //省略
        invokeCalc(10,20,(a,b)-> a+b);
    }
    //定义一个方法，参数传递两个int类型的整数，参数cdCalculator接口，
    // 方法内部电泳Calculator中的方法calc计算和
    public static void invokeCalc(int a,int b ,Calculate calculate){
        int sum= calculate.calc(a,b);
        System.out.println(sum);
    }
}
