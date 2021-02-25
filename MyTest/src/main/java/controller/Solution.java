package controller;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @Author: jwq
 * @Date: 2021/2/25 14:49
 */
/*
 * 计算一组数字的和
 * @param numbers string字符串ArrayList 一组自然数
 * @return string字符串
 */
public class Solution {
    public static String sum(ArrayList<String> numbers){
        BigDecimal bigDecimal = new BigDecimal(0);
        for (String str : numbers){
            BigDecimal decimal = new BigDecimal(str);
            bigDecimal.add(decimal);
        }


        return bigDecimal.toString();
    };
}
