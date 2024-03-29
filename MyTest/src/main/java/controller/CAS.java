package controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS compareAndSet (比较并替换Compare And Swap cpu并发原语)
 * CAS并发原语体现在Java语言中就是sun.misc.Unsafe类的各个方法。调用UnSafe类中的CAS方法，
 * JVM会帮我们实现出CAS汇编指令，这是一种完全依赖于硬件的功能，通过它实现了原子操作，再次强调，
 * 由于CAS是一种系统原语，原语属于操作系统用于范畴，是由若干条指令组成，用于完成某个功能的一个过程，
 * 并且原语的执行必须是连续的，在执行过程中不允许被中断，也就是说CAS是一条CPU的原子指令，
 * 不会造成所谓的数据不一致的问题，也就是说CAS是线程安全的。
 * @Author: jwq
 * @Date: 2021/1/4 17:34
 */
public class CAS {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        //期望值与实际值相同，修改成功
        boolean b = atomicInteger.compareAndSet(5, 2021);
        //期望值与实际值不符，修改失败
        boolean b1 = atomicInteger.compareAndSet(5, 1024);
        System.out.println(b + " " + atomicInteger.get());
        System.out.println(b1 + " " + atomicInteger.get());

        //String string [] = {"1"};
        // string[0] = "1";

        UUID uuid = UUID.randomUUID();//生成唯一不重复订单号
        String id = uuid.toString();
        System.out.println(id);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前日期: " + now + " " + now.getDayOfWeek());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowFormat = now.format(dateTimeFormatter);
        System.out.println("格式化后的当前日期：" + nowFormat);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        //df.format(new Date());
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println(new Date());
    }

}
