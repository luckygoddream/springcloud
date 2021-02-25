package controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Author: jwq
 * @Date: 2021/2/25 10:26
 */
//建立三个线程A、B、C，A线程打印10次字母A，B线程打印10次字母B,
// C线程打印10次字母C，但是要求三个线程同时运行，并且实现交替打印，即按照ABCABCABC的顺序打印
/*
*CompletableFuture
*从Java 8开始引入了CompletableFuture，它针对Future做了改进，
* 可以传入回调对象，当异步任务完成或者发生异常时，自动调用回调对象的回调方法。
* */
public class ABCTest {
    public static void test(){
        for (int i = 1; i <= 10 ; i++) {
            CompletableFuture.runAsync(()->{
                System.out.println("线程A");
            }).thenRunAsync(()->{
                System.out.println("线程B");
            }).thenRunAsync(()->{
                System.out.println("线程C");
            });
            //暂停一秒是为了让上面都输出完，然后进行下一次循环
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        test();

    }
}
