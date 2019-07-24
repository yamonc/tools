package com.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
public class Demo1Arrays {
    public static void main(String[] args) {
        Person[] arr={
                new Person("cym",11),
                new Person("yyh",221),
                new Person("jhj",13),
        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (Person p : arr) {
            System.out.println(p);
        }
        //使用lambda表达式简化匿名内部类
        System.out.println("------------使用lambda表达式");
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o2.getAge()-o1.getAge();

        });
        Arrays.sort(arr,(o1,o2)->o2.getAge()-o1.getAge());
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
