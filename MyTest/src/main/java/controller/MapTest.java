package controller;

import org.openjdk.jol.info.ClassLayout;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author jwq
 * @Date 2023/2/17 12:45
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("1",1);
        ConcurrentMap concurrentMap = new ConcurrentHashMap();
        concurrentMap.put("1",1);

       String s = "5";
        int i = s.hashCode();
        System.out.println(i);
        int i1 = i >>> 16;
        System.out.println(i1);

        int i2 = i ^ i1;
        System.out.println(i2);

        //查看对象头信息，需要导包
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
