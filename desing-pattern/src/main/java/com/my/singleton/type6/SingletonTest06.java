package com.my.singleton.type6;

/**
 * @author liberxk
 * @Date 2019/8/31 15:29
 */

public class SingletonTest06 {

    public static void main(String[] args) {

    }
}


class Singleton {

    private Singleton() {

    }

    /**
     * volatile让修改对其他线程立即可见
     */
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
