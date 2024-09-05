package controller;

import java.math.BigDecimal;

/**
 * @Author jwq
 * @Date 2022/11/23 10:10
 */
public class MyTest {
    public static void main(String[] args) {
        // BigDecimal bigDecimal = new BigDecimal("3.4");
        // int i = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
        // System.out.println(i);

        int a = 9;
        int b = a++;
        int c = ++a;
        int d = c--;
        int e = --d;

        // a = 11, b = 9, c = 10, d = 10 ,e = 10
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
