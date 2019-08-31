package com.my.singleton.type7;

/**
 * @author liberxk
 * @Date 2019/8/31 15:29
 */

public class SingletonTest07 {

    public static void main(String[] args) {

    }
}


class Singleton{
    private Singleton() {

    }

    /**
     * 1.Singleton装载时，SingletonInstance不会被装载
     * 2.调用getInstance时，内部类才会装载，类装载时线程安全
     */
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

