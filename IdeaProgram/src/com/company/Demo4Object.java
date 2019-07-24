package com.company;

import java.util.Objects;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/18
 */
/*
* object类中的静态方法：
* public static <T> requireNonNUll(T obj):查看指定引用对象是不是null
* */
public class Demo4Object {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object object){
        //对传递过来的参数进行合法性判断，判断是否为null
       /* if(object==null){
            throw new NullPointerException("传递的对象值是null");
        }*/
        Objects.requireNonNull(object);
        Objects.requireNonNull(object,"传递的对象是空");
    }
}
