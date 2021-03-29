package controller;

/**
 * @Author: jwq
 * @Date: 2021/3/29 15:01
 */
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {6,3,8,2,9,1};
        int temp;
        for (int i = 0; i < arr.length - 1 ; i++) {//外圈控制趟数
            for (int j = 0; j <arr.length-1-i ; j++) {//内圈控制排序次数
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                };
            }
        }
        for (int num : arr){
            System.out.println(num);
        }
    }
}
