package com.southwind.test;


class Insect{
    private int i=9;
    protected int j;
    Insect(){
        System.out.println("i="+i+",j="+j);
        j=39;
    }
    private static int x1=printInit("static Insect.x1.initialized");
    static int printInit(String string) {
        // TODO Auto-generated method stub
        System.out.println(string);
        return 47;
    }
}

public class Battle extends Insect {
    private int k=printInit("Bettle.k initizlized");
    public Battle(){
        System.out.println("k="+k);
        System.out.println("j="+j);
    }
    private static int x2=printInit("statc battel.x2 initialize");
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("battel constructor");
        Battle b = new Battle();
        /*
         * 类加载完成后再创建对象
         * 当编译器加载Battle类时，发现它有Insect基类，先加载Insect,所以先打印第一句
         * 然后加载Battle,发现静态成员，打印第二句
         * 然后执行入口函数，打印第三局
         * 创建对象时，向外扩展，先创建基类对象（成员先初始化，在执行构造函数）
         *
         */
    }

}