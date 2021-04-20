package controller;

/**
 * @Author: jwq
 * @Date: 2021/3/22 15:21
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new StringBuffer("58").append("tongcheng").toString();
        String s2 = s1.intern();
        System.out.println(s1 == s2);//true 除了java关键字，其它的都是true


        //java是关键字，sun.misc.Version类会在JDK类库的初始化过程中被加载并初始化，
        // 而在初始化是需要对静态常量字段指定的常量值（ConstantValue）做默认初始化,此时
        //被sun.misc.Version.launcher静态常量字段所引用的"java"字符串字面量就别intern到
        //HotSpot VM的字符串常量池--StringTable里了。
        String s3 = new StringBuffer("ja").append("va").toString();
        String s4 = s3.intern();
        System.out.println(s3 == s4);//false


    }
}
