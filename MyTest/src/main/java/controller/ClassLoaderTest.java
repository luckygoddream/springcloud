package controller;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层，扩展类加载器
        ClassLoader exClassLoader = classLoader.getParent();
        System.out.println(exClassLoader);//sun.misc.Launcher$ExtClassLoader@6073f712

        //获取其上层，获取不到引导类加载器
        ClassLoader btClassLoader = exClassLoader.getParent();
        System.out.println(btClassLoader);//null

        //对自定义的类，使用系统类加载器来加载
        ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader1);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类库使用引导类加载器来加载->java核心类库都是使用引导类加载器来加载的
        ClassLoader stClassloder = String.class.getClassLoader();
        System.out.println(stClassloder);//null
    }
}
