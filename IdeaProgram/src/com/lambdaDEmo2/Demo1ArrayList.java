package com.lambdaDEmo2;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/24
 */
/*可推到可省略
* 凡是根据上下文推到出来的内容，都可以省略书写
* 可以省略的内容：
*   1，（参数列表）：括号中参数列表的数据类型，可以省略不写
*   2，（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
*   3.{代码}ruguo {}的代码只有一行，无论是否有返回值，都可以省略{}return 和分号
*   ·要省略都一起省略
* */
public class Demo1ArrayList {
    //jdk1.7之前，创建集合对象必须把前后的泛型都写上
    ArrayList<String> list=new ArrayList<String>();
    //jdk1.7后，=后面的泛型可以省略，后面的泛型可以根据前面的泛型推到出来
    ArrayList<String> l=new ArrayList<>();
}
