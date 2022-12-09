package controller;

import java.math.BigDecimal;

/**
 * @Author jwq
 * @Date 2022/11/23 10:10
 */
public class MyTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("3.4");
        int i = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
        System.out.println(i);
    }
}
