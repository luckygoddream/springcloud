package controller;

import lombok.Data;

import java.util.Scanner;

/**
 * @Author jwq
 * @Date 2022/4/3 21:19
 */
public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] j = new int[5];
        test[] tests = new test[5];
        for (int i = 0; i < 5; i++) {
            j[i] = scanner.nextInt();
            tests[i] = new test();
            tests[i].a = scanner.nextInt();
            System.out.println(tests[i].a);
            System.out.println(j[i]);
        }
    }

}

class test {
    int a;
    int b;
    int c;
}