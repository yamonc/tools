package com.company;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/18
 */
public class Demo2Exception {
    public static void main(String[] args) {



        int[] arr={1,2,3};
        int e = getElement(arr, 3);
        System.out.println(e);
    }
    /*
    * 定义一个方法：
    *   int[] arr
    * int index
    * */
    public static int getElement(int[] arr,int index){
        int ele=arr[index];
        return ele;
    }
}
