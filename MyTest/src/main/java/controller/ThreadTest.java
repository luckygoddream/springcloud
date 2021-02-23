package controller;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: jwq
 * @Date: 2021/2/23 17:40
 */
/*
*开启两个线程A、B，打印1到10，线程A打印奇数（1、3、5、7、9），线程B打印偶数（2、4、6、8、10）
*
*LockSupport是一个编程工具类，主要是为了阻塞和唤醒线程用的
* */
public class ThreadTest {
    static Thread threadA;
    static Thread threadB;
    public static void main(String[] args) {
       threadA = new Thread(()->{
            for (int i = 0; i <= 10 ; i++) {
                if (i % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    //释放threadB线程
                    LockSupport.unpark(threadB);
                    //锁定threadA线程
                    LockSupport.park();

                }
            }
        },"A");

       threadB = new Thread(()->{
           for (int i = 1; i <= 10 ; i++) {
               if (i % 2 == 0){
                   System.out.println(Thread.currentThread().getName()+":"+i);
                   //threadA
                   LockSupport.unpark(threadA);
                   //锁定threadBB线程
                   LockSupport.park();

               }
           }
       },"B");
       threadA.start();
       threadB.start();

    }
}
