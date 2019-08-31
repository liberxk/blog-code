package com.my.singleton.type9;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liberxk
 * @Date 2019/8/31 17:52
 */

public class SingletonTest09 {
    public static void main(String[] args) {

    }
}

class Singleton {

    private Singleton() {

    }

    private final static String INSTANCE = "INSTANCE";
    /**
     * 要用ConcurrentHashMap
     */
    private static Map<String, Singleton> map = new ConcurrentHashMap<>();

    public static Singleton getInstance() {
        Singleton singleton = map.get(INSTANCE);
        if (singleton == null) {
            singleton = new Singleton();
            map.put(INSTANCE, singleton);
        }
        return singleton;
    }
}
