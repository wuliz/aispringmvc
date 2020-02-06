package com.southwind.test;

import java.util.Random;
import java.lang.ClassLoader;

/*1、接口中只能定义常量和抽象方法
   2、常量在编译时就放到了调用该类的常量池当中
   3、所以Mychild5 和 MyParent5既没有被加载也没有被初始化


   2、如果定义的常量得在运行时才能确定，就会按照一般的加载原则，先加载父类，再加载子类
* */
public class TestInterface {
    public static void main(String[] args) {
        System.out.print(new MyChild5Class().getName());
    }
}
interface  MyParent5{
    int a = 10;
}
interface  Mychild5 extends MyParent5{
    //int b=6;//默认就是 public static final int b = 6

   int b= new Random().nextInt(2);//默认就是 public static final int b = 6
}
 class MyChild5Class  implements MyParent5{
    private String name;
    public String getName(){
        return this.name;
    }
 }