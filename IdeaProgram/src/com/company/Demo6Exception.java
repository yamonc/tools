package com.company;

import java.io.IOException;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/18
 */
/*
 * try{
 *   可能产生异常的代码
 * }catch 定义一个异常变量
 * * */
public class Demo6Exception {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");
        } catch (IOException e) {
            System.out.println("eeeee文件名错误");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            /*无论是否出现异常都会执行，不可以单独执行，必须和try一起使用
            * 一般用于资源释放资源回收，无论程序是否出现异常，都会回收
            * */
            System.out.println("终于执行了！！！");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀民错误");
        }

    }


}
