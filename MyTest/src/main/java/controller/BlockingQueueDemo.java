package controller;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: jwq
 * @Date: 2021/3/11 15:31
 */
/*
BlockingQueue阻塞队列是属于一个接口，底下有七个实现类:
ArrayBlockQueue：由数组结构组成的有界阻塞队列

LinkedBlockingQueue：由链表结构组成的有界（但是默认大小 Integer.MAX_VALUE）的阻塞队列,有界，但是界限非常大，相当于无界，可以当成无界

PriorityBlockQueue：支持优先级排序的无界阻塞队列
DelayQueue：使用优先级队列实现的延迟无界阻塞队列

SynchronousQueue：不存储元素的阻塞队列，也即单个元素的队列,生产一个，消费一个，不存储元素，不消费不生产

LinkedTransferQueue：由链表结构组成的无界阻塞队列
LinkedBlockingDeque：由链表结构组成的双向阻塞队列
这里需要掌握的是：ArrayBlockQueue、LinkedBlockingQueue、SynchronousQueue
* */
public class BlockingQueueDemo {
    public static void main(String[] args) {
 //      Integer i =  ThreadLocalRandom.current().nextInt(199);
 //      System.out.println(i);
        for (int j = 1; j <= 10 ; j++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+":"+ ThreadLocalRandom.current().nextInt(199));
            },Thread.currentThread().getName()+j).start();
        }
    }
}
