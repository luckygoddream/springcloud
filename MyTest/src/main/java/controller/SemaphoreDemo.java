package controller;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: jwq
 * @Date: 2021/3/11 15:09
 */
/*
 信号量主要用于两个目的,一个是用于共享资源的互斥使用,另一个用于并发线程数的控制
* */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);//模拟3个停车位
        for (int i = 1; i <=  6 ; i++) {//模拟6部车
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到车位");
                    TimeUnit.SECONDS.sleep(2);//停车时间
                    System.out.println(Thread.currentThread().getName()+"离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();//释放车位，让后面车进来
                }

            },String.valueOf(i)).start();
        }


    }
}
