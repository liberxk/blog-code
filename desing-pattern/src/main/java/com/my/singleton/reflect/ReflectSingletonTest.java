package com.my.singleton.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liberxk
 * @Date 2019/8/31 17:59
 */
public class ReflectSingletonTest{

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Singleton> clazz = Singleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance = Singleton.getInstance();
        Singleton reflectInstance = (Singleton) constructor.newInstance();

        System.out.println(instance == reflectInstance);
    }

}
 class Singleton {

    private Singleton(){
        //防止反射攻击, 不加上该段，上述运行结果为false
        if (SingletonHolder.INSTANCE != null) {
            throw new IllegalStateException();
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
