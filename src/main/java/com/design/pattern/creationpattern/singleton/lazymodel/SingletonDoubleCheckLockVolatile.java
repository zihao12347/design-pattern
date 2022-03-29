package com.design.pattern.creationpattern.singleton.lazymodel;

/**
 * @Author:aaa
 * @Date:11:21
 * @Version 1.0
 */

/**
 * 懒汉模式-双重检查锁+volatile关键字
 *      双重检查锁方式创建对象，为了保证线程的安全性，和性能问题，调整了加锁时期，不需要每次调用
 *      创建对象的方法都加锁，但是由于jvm在程序编译会运行期间会对指令重排序，在多线程情况下这样可能出现null指针异常
 *
 *      使用volatile关键字可以保证线程的可见性和有序性
 *
 *      *volatile关键字，用来修饰一个共享变量（一个成员变量，类的全局变量），被volatile关键字修饰之后
 *      可以保证线程的：可见性（一个线程修改了该共享变量，这个新值对其他线程来说是立即可见的），
 *      有序性（禁止指令重排序）
 */
public class SingletonDoubleCheckLockVolatile {
    /**
     * 私有构造方法：避免被外部再创建对象，保证单例特性
     */
    private SingletonDoubleCheckLockVolatile(){
    }
    //声明成员变量，使用volatile关键字修饰，保证线程的可见性和有序性
    private static volatile SingletonDoubleCheckLockVolatile singletonDoubleCheckLockVolatile;

    /**
     * 使用双重检查锁方式创建对象，调整加锁时期，保证单例，线程安全，性能的问题
     * @return
     */
    public static SingletonDoubleCheckLockVolatile getInstant(){
        //当对象为null时，抢夺锁创建对象
        if (singletonDoubleCheckLockVolatile==null) {
            //添加同步代码块，保证线程安全
            synchronized (SingletonDoubleCheckLockVolatile.class){
                //再次判断对象是否为null,保证单例特性
                if (singletonDoubleCheckLockVolatile == null) {
                    singletonDoubleCheckLockVolatile=new SingletonDoubleCheckLockVolatile();
                }
            }
        }
        return singletonDoubleCheckLockVolatile;
    }
}
