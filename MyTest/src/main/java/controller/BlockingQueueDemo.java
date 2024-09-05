package controller;

import lombok.Data;
import lombok.Getter;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: jwq
 * @Date: 2021/3/11 15:31
 */
/**
BlockingQueue阻塞队列是属于一个接口，底下有七个实现类:
ArrayBlockQueue：由数组结构组成的有界阻塞队列

LinkedBlockingQueue：由链表结构组成的有界（但是默认大小 Integer.MAX_VALUE）的阻塞队列,有界，但是界限非常大，相当于无界，可以当成无界

PriorityBlockQueue：支持优先级排序的无界阻塞队列
DelayQueue：使用优先级队列实现的延迟无界阻塞队列

SynchronousQueue：不存储元素的阻塞队列，也即单个元素的队列,生产一个，消费一个，不存储元素，不消费不生产

LinkedTransferQueue：由链表结构组成的无界阻塞队列
LinkedBlockingDeque：由链表结构组成的双向阻塞队列
这里需要掌握的是：ArrayBlockQueue、LinkedBlockingQueue、SynchronousQueue

 ArrayBlockingQueue是基于数组（array-based）的先进先出（FIFO）有界（bounded）阻塞队列。
 创建队列时，必须要指定队列容量（capacity），即数组大小。
 创建队列时，可以传入Collection来初始化队列元素。
 队列一旦被创建，那么队列容量不能被改变。
 队列支持公平模式和非公平模式，默认非公平模式。
 队列中只有一把锁，写锁和读锁未分离，并发控制采用了经典的two-condition（notEmpty、notFull）算法。

 LinkedBlockingQueue是基于链表（linked nodes）的先进先出（FIFO）的可选界（optionally-bounded）的阻塞队列。
 创建队列时，为了避免额外开销，可以指定队列容量（capacity）；如果不指定队列容量，那么默认队列容量为Integer.MAX_VALUE。
 创建队列时，可以可以传入Collection来初始化队列元素，此时不能指定队列容量，默认为Integer.MAX_VALUE。
 队列中的count即当前队列元素个数，采用AtomicInteger，避免put和take的竞争。
 与ArrayBlockingQueue不同的是，LinkedBlockingQueue队列中有两把锁，读锁和写锁是分离的。
 在使用LinkedBlockingQueue时，若队列大小为默认值，且生产速度大于消费速度时，可能会内存溢出。
 LinkedBlockingQueue理论上来说比ArrayBlockingQueue有更高的吞吐量，但是在大多数的实际应用场景中，却没有很好的表现。

* */
public class BlockingQueueDemo {
    public static void main(String[] args) {
 //      Integer i =  ThreadLocalRandom.current().nextInt(199);
 //      System.out.println(i);
//       for (int j = 1; j <= 10 ; j++) {
//            new Thread(()->{
//                System.out.println(Thread.currentThread().getName()+":"+ ThreadLocalRandom.current().nextInt(199));
//            },Thread.currentThread().getName()+j).start();
//        }
        String s = "hhhhhhhhffffffff";
        String x = s.replace("g","");

        System.out.println(x);
       // System.out.println(s);
        Perpon perpon = new Perpon();
        perpon.setAge("132");
        perpon.setName("dfggh");
        get(perpon);
        //System.out.println(perpon.getAge());
        System.out.println();
    }

    public static  String get(Perpon perpon){
        String age = perpon.getAge();
        String s = age.replace("2","");
        return s;
    }

}
@Data
class  Perpon{
    private String name;
    private String age;
}
