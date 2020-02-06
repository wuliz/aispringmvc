package com.southwind.test;
//常量在编译阶段会存入到调用这个常量的方法所在的类的常量池中
/*
本质上，调用类没有直接引用到定义常量的类
 */
public class ConstantTest {
    public static void main(String[] args){
        System.out.println(MyConstant.name);
    }
}
class MyConstant{
    public  static final  String name = "hello world";//静态常量
    static {
        System.out.println("MyConstant");
    }
}