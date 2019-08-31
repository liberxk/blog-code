package com.my.singleton.type8;

/**
 * @author liberxk
 * @Date 2019/8/31 17:14
 */

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum Singleton{
    /**
     *定义一个枚举元素，代表了Singleton的一个实例
     */
    INSTANCE;

    public void operation() {

    }
}


