package com.design.pattern.creationpattern.singleton.lazymodel;

/**
 * 懒汉模式-线程安全
 *    在getInstant()全局获取创建对象的方法上加synchronized关键字
 *
 *    *这种在全局获取创建对象方法上加synchronized关键字方法，可以保证线程的安全，但是又会导致该方法
 *     执行效率特别低
 *
 */
public class SingletonSafeThread {
    /**
     * 私有构造方法：避免外部创建该类对象，确保该类只有一个对象被创建
     */
    private SingletonSafeThread(){
    }
    //在成员变量中声明对象
    private static SingletonSafeThread singletonSafeThread;

    /**
     * 对外提供全局的创建对象方法，获取对象
     * @return
     */
    public synchronized SingletonSafeThread getInstant(){
        if (singletonSafeThread==null) {
            singletonSafeThread=new SingletonSafeThread();
        }
        return singletonSafeThread;
    }
}
