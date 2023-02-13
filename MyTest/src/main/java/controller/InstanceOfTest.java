package controller;

/**
 * @Author jwq
 * @Date 2023/2/2 16:16
 * java判断类型的方法
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        Integer i = 5;
        boolean b = i instanceof Object;
        System.out.println(b);
        boolean instance = Integer.class.isInstance(i);
        System.out.println(instance);

    }
}
