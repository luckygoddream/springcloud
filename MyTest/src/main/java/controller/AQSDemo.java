package controller;

// import javax.xml.soap.Node;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author jwq
 * @Date 2021/4/8 16:24
 */
public class AQSDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        Condition condition = reentrantLock.newCondition();


        reentrantLock.lock();
        reentrantLock.unlock();



        // ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        // concurrentHashMap.put("1", 1);
        // concurrentHashMap.get("1");
        // Set<Map.Entry<String, Integer>> entries = concurrentHashMap.entrySet();
        // for (Map.Entry<String, Integer> entry : entries) {
        //     entry.getKey();
        // }
        //
        // Integer integer = new Integer(5);
        // Integer integer1 = new Integer(5);
        // System.out.println(integer == integer1);
    }
}
