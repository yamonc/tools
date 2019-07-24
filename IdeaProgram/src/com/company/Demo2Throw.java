package com.company;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/18
 */

/*
* throw关键字
*   使用throw关键字在指定的方法中抛出指定的异常
*   使用格式：
*       throw new xxxException（异常产生的原因）
*   主要：
*       1，throw关键字必须写在方法内部
*       2，throw关键字后边new的对象必须是Exception或者Exception的子类对象
*       3，throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
*           throw关键字后面创建的是RuntimeException或者是RuntimeException的子类对象，
*              我们可以不处理，默认交给jvm虚拟机处理（打印异常对象，中断程序）
*           throw关键字后面创建的是编译异常，我们就必须处理这个异常，throw或者try——catch
*
* ArrayIndexOutOfBoundsException\NullPointerException运行期异常
*
* */
public class Demo2Throw {
    public static void main(String[] args) {
        int[] arr=new int[3];
        int e = getElement(arr, 55);
        System.out.println(e);

    }
    /*
     * 定义一个方法：
     *   int[] arr
     * int index
     * */
    public static int getElement(int[] arr,int index){
        /*
        * 我们可以对传递过来的参数数组，进行合法性校验
        *  如果数组arr的值为null那么就抛出指针异常，告知放方法的调用者传递的值为null
        *
        * */
        if (arr == null) {
            throw new NullPointerException("传递的数组的值为null");
        }
        /*
        * 对传递过来的参数进行合法性校验
        * 如果index的访问不在数组的索引范围内，抛出异常，告诉方法的调用者，传递的索引超出了数组的方位
        * */
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        int ele=arr[index];
        return ele;
    }
}
