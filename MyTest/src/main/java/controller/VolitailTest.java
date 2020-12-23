package controller;

public class VolitailTest {
   private static Integer i = 5;

    public static void main(String[] args) {


        new Thread(()->{
            i = 10;
            System.out.println(i);
        }).start();



    }
}
