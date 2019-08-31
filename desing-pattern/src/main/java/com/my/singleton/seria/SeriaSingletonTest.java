package com.my.singleton.seria;
import java.io.*;

/**
 * @author liberxk
 * @Date 2019/8/31 18:22
 */

public class SeriaSingletonTest {
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/seria.txt"));
        oos.writeObject(instance);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/seria.txt"));
        Singleton instance2 = (Singleton) ois.readObject();
        System.out.println(instance == instance2);
    }

}

class Singleton implements Serializable {
    private Singleton() {

    }

    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * 防止反序列化时单例被破坏
     * @return
     */
    private Object readResolve() {
        return instance;
    }
}
