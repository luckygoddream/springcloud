package controller;

import org.openjdk.jol.info.ClassLayout;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author jwq
 * @Date 2023/2/17 12:45
 */
/**
当 int 类型左移/右移位数大于等于 32 位操作时，会先求余（%）后再进行左移/右移操作。
也就是说左移/右移 32 位相当于不进行移位操作（32%32=0），左移/右移 42 位相当于左移/右移 10 位（42%32=10）。
当 long 类型进行左移/右移操作时，由于 long 对应的二进制是 64 位，因此求余操作的基数也变成了 64。
也就是说：x<<42等同于x<<10，x>>42等同于x>>10，x >>>42等同于x >>> 10。
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
        long l = 111L;
        BigInteger bigInteger = new BigInteger(String.valueOf(l));

        //查看对象头信息，需要导包
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
