package com.company;

import java.io.FileNotFoundException;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/18
 */
/*
* 当方法内部抛出异常对象的时候，必须处理这个异常
* 可以使用throws关键字处理异常对象，会把异常对象抛出给方法的处理处
* 给别人处理，交给jvm处理，--》中断处理
* 在方法声明时使用
*   修饰符 返回值类型 方法名（参数列表） throws{
*
*      throw new AAAExcption（产生原因）
* }
*   1throws必须写在方法声明出
*   2throws必须是Exception或者Exception的子类
*   3方法内部如果抛出了多个异常，那么throws必须声明多个异常
*       如果抛出的多个异常对象有子父类关系，直接声明父类异常计科
*   4调用了一个声明抛出异常的方法，我们就必须处理声明的异常
*       要么继续使用throws，交给方法的调用者处理最终交给JVM处理
*       要么try-catch异常
* */
public class Demo5Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("c:\\a.txt");
    }
    /*
    * 定义一个方法，对传递的文件路径进行合法性的判断
    * 如果路径不是：“C：\\a.txt”，那么我们就抛出文件找不到异常对象，告知方法的调用者
    *FileNotFoundException是编译异常必须处理
    * 可以使用throws继续声明抛出这个异常对象。让方法的调用者处理
    * */
    public static void readFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是 c:\\a/txt");

        }
    }
}
