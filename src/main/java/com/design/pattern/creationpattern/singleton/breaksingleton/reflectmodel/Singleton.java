package com.design.pattern.creationpattern.singleton.breaksingleton.reflectmodel;

/**
 * @Author:aaa
 * @Date:16:33
 * @Version 1.0
 */

import java.io.Serializable;

/**
 * 反射方式破快单例模式
 */
public class Singleton {
    //声明volatile关键字的私有静态成员变量，保证单例对象的可见性和有序性
    private volatile static Singleton singleton;
    //私有构造方法，避免外部创建单例对象
    private Singleton(){};

    /**
     * 通过双重检查锁方式创建单例对象
     * @return
     */
    public static Singleton getInstance(){
        //第一个if判断单例对象为空时，才获取锁，创建对象，否则直接返回内存中的单例对象
        if (singleton == null) {
            //静态代码块，保证线程同步
          synchronized (Singleton.class){
              //第二个if再次判断单例对象是否为空，在多线程环境下保证单例特性。
              if (singleton==null) {
                  singleton=new Singleton();
              }
          }
        }
        return singleton;
    }
}
