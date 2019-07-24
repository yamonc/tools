package com.company;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/18
 */
public class Demo8RegisterException {
    /*
    * 1，使用数组保存已经注册过的用户
    * 2，使用Scanner类获取用户输入的用户名
    * 3，定义一个方法，对用户输入的注册的用户名进行判断
    *   遍历存储的用户名的数字，获取没一个个用户名
    *   使用获得到的用户名和用户输入的用户名比较
    *   如果true则存在
    *   false 继续遍历
    *   提示用户，恭喜注册成功
    * */
    static String[] usernames={"张三","李四","王五"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = sc.next();
        checkUsername(username);
    }
    public static void checkUsername(String username){
        for (String name : usernames) {
            if(name.equals(username)){
                throw new RegisterException("该用户 已经被注册");
            }
        }
        System.out.println("恭喜你，注册成功！");
    }
}
