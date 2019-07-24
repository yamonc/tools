package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* Exception:编译器异常，java程序出现的问题
*    RuntimeException；运行过程中出现的问题
*       异常就相当于程序的了小毛病，把异常处理掉，程序可以继续执行
* Error：错误
*       错误就相当于 程序得了无法治愈的毛病。必须修改源代码，程序才能继续执行
* */
public class ExceptionDemo1 {
    public static void main(String[] args) {
       /* SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("1990-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/
     /*  int[] arr={1,2,3};
        System.out.println(arr[0]);
        try{
            //可能会出现异常代码
            System.out.println(arr[3]);
        }catch (Exception e){
            //异常处理的逻辑
            System.out.println(e);
        }
*/
        int[] arr=new int[1024];
        System.out.println("后续代码！");
    }


}
