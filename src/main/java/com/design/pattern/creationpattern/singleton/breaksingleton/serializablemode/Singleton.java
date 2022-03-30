package com.design.pattern.creationpattern.singleton.breaksingleton.serializablemode;

/**
 * @Author:aaa
 * @Date:16:03
 * @Version 1.0
 */

import java.io.Serializable;

/**
 * 单例模式-静态内部类创建单例对象，保证线程的安全性，内存，单例特性等问题
 *
 *      *实现Serializable接口，用于序列化
 */
public class Singleton implements Serializable {
    /**
     * 私有构造方法，避免外部创建单例对象
     */
    private  Singleton(){}

    /**
     * 静态内部类创建单例对象
     */
    private static class SingletonHolder{
        //静态变量创建单例对象
        private static Singleton singleton=new Singleton();
    }

    /**
     * 对外静态方法，获取单例对象
     * @return
     */
    public static Singleton getInstant(){
        return SingletonHolder.singleton;
    }

    /**  解决序列化反序列化破坏单例模式，
     *   readValue()方法，在反序列化时，会自动调用该方法。然后返回有静态内部类创建的单例实例对象
     * @return
     */
    private Object readValue(){
        return SingletonHolder.singleton;
    }

}
