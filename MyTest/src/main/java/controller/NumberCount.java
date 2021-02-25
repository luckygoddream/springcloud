package controller;

/**
 * @Author: jwq
 * @Date: 2021/2/25 15:02
 */
/*
 * 计算int对应二进制中1的个数
 * @param n int整型 数字
 * @return int整型
 */
public class NumberCount {
    public int number(int i){
        int sum = 0;
        if (i >0){
            while (i>0){
                if (i % 2 == 1){
                    sum++;
                }
                  i /= 2;
            }
        }
        return sum;
    }
}
