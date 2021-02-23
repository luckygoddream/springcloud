package controller;

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
    }
}
