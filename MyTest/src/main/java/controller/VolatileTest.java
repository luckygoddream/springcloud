package controller;

import java.util.concurrent.TimeUnit;

/**
 * @Author: jwq
 * @Date: 2020/12/23 10:32
 */
public class VolatileTest {


    //volatile 保证jmm中线程之间变量的可见性，不保证原子性，保证有序性（禁止指令重排序）

    public static void main(String[] args) {
        MyData myData = new MyData();

        new Thread(()->{
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
        },"first").start();

        //未加volatile 线程间变量未同步会一直等待
        while (myData.num==0){
          //  System.out.println(System.currentTimeMillis());
        }
        //加上volatile线程间会同步变量值执行下面语句
        System.out.println(Thread.currentThread().getName());
        System.out.println(myData.num);

    }
}
class MyData{
    //定义使用volatile
    int num = 0;

    void add(){
        this.num = 60;
    }
        }
