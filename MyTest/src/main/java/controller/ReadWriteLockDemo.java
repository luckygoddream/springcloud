package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * @Author: jwq
 * @Date: 2021/2/22 16:28
 * 读写锁
 * 读-读 可以共存
 * 读-写 不能共存
 * 写-写 不能共存
 */
class MyCatch{//资源类
    private volatile Map<String,Object> map = new HashMap<>();
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();//专门的读写锁

    public void put(String key,Object value){
        readWriteLock.writeLock().lock();
        try {
            System.out.println("正在写入");
            map.put(key,value);
            System.out.println("写入完成");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }
    public Object get(String key) {
        Object o = null;
        readWriteLock.readLock().lock();
        try {
            System.out.println("正在读取");
             o = map.get(key);
            System.out.println("读取完成:" + o);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }
        return o;
    }


};

public class ReadWriteLockDemo {
    public static void main(String[] args) {
    MyCatch myCatch = new MyCatch();
        for (int i = 1; i <=5 ; i++) {
            final  int t = i;
            new Thread(()->{
                myCatch.put(t+"",t+"");
            }).start();
        }

        for (int i = 1; i <=5 ; i++) {
            final  int t = i;
            new Thread(()->{
                myCatch.get(t+"");
            }).start();
        }
    }
}
