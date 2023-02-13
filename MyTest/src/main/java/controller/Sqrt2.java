package controller;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: jwq
 * @Date: 2021/2/23 14:53
 *
 */
/*
* 已知 sqrt (2)约等于 1.414，要求不用数学库，求 sqrt (2)精确到小数点后 10 位。
* */
public class Sqrt2 {
    static final double EPSILON = 0.0000000001;

    static double sqrt2(){
      double low = 1.4,high = 1.5;
      double mid = (low + high)/2;
      while (high - low > EPSILON){
          if(mid * mid > 2){
            high = mid;
          }else {
              low = mid;
          }
          mid = (low + high)/2;
      }
      return mid;
    };


    public static void main(String[] args) {
        double mid = sqrt2();
        System.out.println(mid);
        System.out.println(9999999+9999);
        List<String> blackTypes = Arrays.asList("Device", "IP", "UDID");
        boolean flag = blackTypes.contains("IP");
        System.out.println(flag);
        String strCom = "I like java！";  //定义一个字符串
        boolean str = strCom.isEmpty();  //判断字符串是否为空
        System.out.println(str);
        double sqrt = Math.sqrt(2);
        System.out.println(sqrt);

    }
}
