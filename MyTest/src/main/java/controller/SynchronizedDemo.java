package controller;

/**
 * @Author jwq
 * @Date 2021/4/6 12:48
 */
public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("synchronized");
        }
    }

}
