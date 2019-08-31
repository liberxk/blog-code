package com.my.singleton.type2;

/**
 * @author liberxk
 * @Date 2019/8/31 15:29
 */

public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

}

class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    static {
        //在静态代码块中创建单例对象
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}

