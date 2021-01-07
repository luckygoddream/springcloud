package controller;

import lombok.Data;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: jwq
 * @Date: 2021/1/7 15:26
 */
@Data
class User{
    String userName;
    Integer age;

    public User(String userName,Integer age){
        this.userName = userName;
        this.age = age;
    }
}


public class AtomicReferenceDemo {
    public static void main(String[] args) {
        User z3 = new User("zhangsan",22);
        User li4 = new User("lisi",23);
        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(z3);
        //原子引用类型 还是会有ABA问题
        boolean b = atomicReference.compareAndSet(z3, li4);
        System.out.println(b +" " + atomicReference.get().toString());
        boolean c = atomicReference.compareAndSet(z3, li4);
        System.out.println(c +" " + atomicReference.get().toString());

    }
}
