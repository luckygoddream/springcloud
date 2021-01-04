package controller;

/**
 * @Author: jwq
 * @Date: 2021/1/4 15:56
 */

//简单单例模式
public class Singleton {
    //volatile禁止指令重排确保多线程下100%安全
    private static volatile Singleton instance = null;

    private Singleton(){

    }

    public Singleton getInstance(){
        //双端检锁
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
