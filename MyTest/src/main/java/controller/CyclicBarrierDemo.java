package controller;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: jwq
 * @Date: 2021/3/11 14:59
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        //和CountDownLatch相反，从0开始到某一大于0的数字结束
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("召唤神龙！");
        });
        for (int i = 1; i <=7 ; i++) {
            final int temp = i;
            new Thread(() -> {
                try {
                    System.out.println("召唤"+temp+"星龙珠！");
                    cyclicBarrier.await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
