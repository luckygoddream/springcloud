package controller;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: jwq
 * @Date: 2021/3/11 14:23
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        //倒计数
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <=6 ; i++) {
            new Thread(()->{
                System.out.println("走人中");
                countDownLatch.countDown();//走一个人，减少一个
            },Thread.currentThread().getName()).start();
        }
        countDownLatch.await();//不到0，不执行下面的代码
        System.out.println("完事儿关门");
    }
}
