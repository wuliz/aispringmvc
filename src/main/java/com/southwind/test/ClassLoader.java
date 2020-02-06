package com.southwind.test;
/*
对应静态字段来说，只有直接定义了该字段的类才会被初始化。
当一个类在初始化时，要求他的父类已经初始化完毕。
类可以加载时不初始化。
-XX:+TraceClassLoading：追踪类加载顺序
-XX:+<option> 开启option选项
-XX:-<option> 关闭option选项
-XX:<option>=<value> 表示将option的值设为value
 */
public class ClassLoader {
    static {
        System.out.println("main init");
    }
    public static void main(String[] args){
        System.out.println(Children.str);
    }
}
class  Parent{
    public static String name = "hello";
    static {
        System.out.println("i am paramt init");
    }
}

class Children extends  Parent{
    public static final String str="hell";
    static {
        System.out.println("i am children init");
    }

}