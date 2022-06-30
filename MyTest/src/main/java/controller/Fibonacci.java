package controller;

/**
 * 斐波那契
 */
public class Fibonacci {
    public static void main(String[] args) {
        int i = fibonacci(10);
        System.out.println(i);
    }

    public static int fibonacci(int number){
        if (number == 0 || number == 1){
            return number;
        }
        return fibonacci(number -1) + fibonacci(number -2);
    }

}
