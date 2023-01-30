package controller;

/**
 * @Author jwq
 * @Date 2021/4/8 9:51
 */
/*
 *可重入锁：可重复可递归调用的锁，在外层使用锁后，在内层也能使用，并且不发生死锁，这样的锁的就叫可重入锁
 * 在一个Synchronized修饰的代码块或方法的内部，调用本类的其它Synchronized修饰的代码块或方法时是永远可以得到锁的。
 * ReentrantLock可重入锁加几次锁就释放几次锁。
 *
 *
 * */
public class ReEnterLockDemo {
    static Object objectLockA = new Object();

    public static void m1(){
        new Thread(()->{
            synchronized (objectLockA){
                System.out.println("外层调用");
                synchronized (objectLockA){
                    System.out.println("中层调用");
                    synchronized (objectLockA){
                        System.out.println("内层调用");
                    }
                }
            }
        }).start();
    };

    public static void main(String[] args) {
        m1();
    }
}
