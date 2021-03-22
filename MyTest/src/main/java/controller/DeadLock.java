package controller;

/**
 * @Author: jwq
 * @Date: 2021/3/22 10:51
 */
/*死锁的4个条件
互斥条件：一个资源只能一个线程持有
不可剥夺条件：进程的资源在没使用完毕之前，不能被剥夺
请求与保持条件：进程已有资源然后又去获取新的已被别的进程持有的资源时，这时请求阻塞但是不会释放自己以已经获得的资源
循环等待条件：
*
*
* */
public class DeadLock {
    public static  String locka = "LockA";
    public static  String lockb = "LockB";

    public static void main(String[] args) {
        Thread threadA = new Thread(new lockA());
        Thread threadB = new Thread(new lockB());
        threadA.start();
        threadB.start();
    }

}
class lockA implements Runnable{
    @Override
    public void run() {
        synchronized (DeadLock.locka){
            System.out.println("获取到locka");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("尝试获取lockb");
            synchronized (DeadLock.lockb){
                System.out.println("已经获取lockb");

            }
        }
    }
};


class lockB implements Runnable{
    @Override
    public void run() {
        synchronized (DeadLock.lockb){
            System.out.println("获取到lockb");

            try {
                //休眠是为了各自都获得自己的锁
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("尝试获取locka");
            synchronized (DeadLock.locka){
                System.out.println("已经获取locka");

            }
        }
    }
};