package com.design.pattern.creationpattern.singleton.breaksingleton.serializablemode;

/**
 * @Author:aaa
 * @Date:16:10
 * @Version 1.0
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;

/**
 * 测试通过序列化反序列化方式破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writerObjectToFile();//写入对象
        Singleton singleton1 = readObjectFromFile();//读取对象
        Singleton singleton2 = readObjectFromFile();
        System.out.println(singleton1==singleton2);//判断读取的是否为相同的对象
    }

    /**
     * 读取保存在文件的单例对象
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Singleton readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\aaa\\Desktop\\a.txt"));
        Singleton singleton = (Singleton)ois.readObject();//读取单例对象
        ois.close();
        return singleton;
    }

    /**
     * 将单例对象写入文件中
     * @throws IOException
     */
    public static void writerObjectToFile() throws IOException {
        Singleton instant = Singleton.getInstant();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\aaa\\Desktop\\a.txt")));
        oos.writeObject(instant);//将单例对象写入文件中
        oos.close();
    }

}
