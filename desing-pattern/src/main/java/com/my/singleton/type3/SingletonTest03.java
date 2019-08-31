package com.my.singleton.type3;

/**
 * @author liberxk
 * @Date 2019/8/31 15:29
 */

public class SingletonTest03 {

    public static void main(String[] args) {

    }
}


class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        //使用到该方法时才去创建
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
