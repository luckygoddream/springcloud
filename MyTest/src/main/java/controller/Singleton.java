package controller;

/**
 * @Author: jwq
 * @Date: 2021/1/4 15:56
 */

//简单单例模式
public class Singleton {

    private static Singleton instance = null;

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
