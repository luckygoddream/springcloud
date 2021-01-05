package controller;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: jwq
 * @Date: 2020/12/23 10:32
 */
public class VolatileTest {

    //数据之间没数据依赖关系时，可能会指令重排序
    //volatile 保证jmm中线程之间变量的可见性，不保证原子性，保证有序性（禁止指令重排序）

    public static void main(String[] args) {


        AtomicInteger integer = new AtomicInteger();
        integer.addAndGet(10);
        MyData myData = new MyData();
        MyData myData1 = new MyData();

        //volatile不保证原子性
        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000 ; j++) {
                    myData1.addPlus();
                    myData1.atomicInt();
                }
            },String.valueOf(i)).start();
        }

        //等待20个线程执行完毕，大于2表示除了main线程和gc线程外，有其它线程在执行
        while (Thread.activeCount()>2){
            //线程等待
            Thread.yield();
        }

        System.out.println(myData1.num);
        System.out.println(myData1.atomicInteger);
        System.out.println(integer);


        //volatile保证可见性
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                //休眠3秒让主线程获取到值
                TimeUnit.SECONDS.sleep(3);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //将值改为60
            myData.add();
            System.out.println(myData.num);
        }, "first").start();

        //未加volatile 线程间变量未同步会一直等待
        while (myData.num == 0) {
            //  System.out.println(System.currentTimeMillis());
        }
        //加上volatile线程间会同步变量值执行下面语句
        System.out.println(Thread.currentThread().getName());
        System.out.println(myData.num);

    }
}

class MyData {
    //定义使用volatile
   int num = 0;

   AtomicInteger atomicInteger = new AtomicInteger();

    void add() {
        this.num = 60;
    }


    //加锁可以保证线程安全
    synchronized void  addPlus() {
        num++;
    }
    void atomicInt(){
        atomicInteger.getAndIncrement();
    }

}
