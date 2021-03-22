package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * @Author jwq
 * @Date 2021/2/2 10:30
 *
 * 独占锁：指该锁一次只能被一个线程所持有。对ReentrantLock和Synchronized而言都是独占锁
 * 共享锁：指该锁可以被多个线程锁持有
 * 对ReentrantReadWriteLock其读锁是共享，其写锁是独占
 *
 * 写的时候只能一个人写，但是读的时候，可以多个人同时读
 * 多个线程 同时读一个资源类没有任何问题，所以为了满足并发量，读取共享资源应该可以同时进行，但是如果一个线程想去写共享资源，就不应该再有其它线程可以对该资源进行读或写
 *
 * 读-读：能共存
 * 读-写：不能共存
 * 写-写：不能共存
 *
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
