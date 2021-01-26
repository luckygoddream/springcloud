package controller;

import com.sun.corba.se.spi.extension.CopyObjectPolicy;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**集合类线程不安全的问题
 * ArrayList
 *
 * @Author: jwq
 * @Date: 2021/1/7 16:30
 */


public class ContainerNotSafeDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        stringList.forEach(System.out::println);

        //多线程下同时添加元素会有ConcurrentModificationException错
        //List<String> strings = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();

        //HashSet线程也不安全
        Set<Integer> set = new HashSet<>();
        set.add(1);
        Iterator<Integer> iterator = set.iterator();
        Object next = iterator.next();
        System.out.println(next);


//        for (int i = 0; i < 30 ; i++) {
//            new Thread(()->{
//                list.add(UUID.randomUUID().toString().substring(0,8));
//                System.out.println(list);
//            }).start();
//        }
        //解决方案1： List<String> strings = new Vector<>(); 不推荐使用，并发下性能急剧下降
        //解决方案2： List list = Collections.synchronizedList(new ArrayList<>()); 锁太重
        //解决方案3： List list = new CopyOnWriteArrayList<>();

    }
}
