package com.design.pattern.creationpattern.singleton.lazymodel;

/**
 * @Author:aaa
 * @Date:10:19
 * @Version 1.0
 */

/**
 * 懒汉模式-双重检查锁：
 *      调整加锁时期，不需要每次调用创建对象的方法时，都加上锁，影响性能
 *
 *      *懒汉模式~双重检查锁:
 *           虽然保证了新能，线程的安全的问题，但是由于jvm在运行或编译时期，会对指令重排序操作，
 *           在多线程情况下，可能出现空指针异常问题，
 *           例子：
 *           双重检查锁在多线程并发时，可能会因为JVM指令重排出问题
 *          代码中 s2 = new SingleTon2();在JVM中可能会分解为:
 *          memory = allocate(); //1：分配对象的内存空间
 *          initInstance(memory); //2：初始化对象
 *          instance = memory; //3：设置instance指向刚分配的内存地址
 *
 *          如果因为某些原因导致指令重排，指令的执行顺序可能为：
 *          memory = allocate(); //1：分配对象的内存空间
 *          instance = memory; //3：设置instance指向刚分配的内存地址，此时对象还没被初始化
 *          initInstance(memory); //2：初始化对象
 *
 *          此时，如果在instance=memory执行，但未完成对象初始化时，另一个线程执行第一个if(s2==null)会返回false直接返回未初始化的
 *          Singleton实例，导致错误。
 *
 *         *指令重排序：
 *             调整指令顺序，在不改变程序语义前提下，尽可能减少寄存在内存器的读取，存储次数，
 *             jvm进行指令重排序提高程序性能，
 *
 *
 */
public class SingletonDoubleCheckLock {
    /**
     * 提供私有构造方法，避免外部创建该类对象，保证该类只能有一个对象被创建
     */
    private SingletonDoubleCheckLock(){}

    //在成员变量中声明对象
    private static SingletonDoubleCheckLock singletonDoubleCheckLock;

    /**
     * 双重检查锁方式：创建/获取对象时，保证不需要每次都加上锁，调整加锁时期，保证新能安全问题
     * @return
     */
    public static   SingletonDoubleCheckLock getInstance(){
        //第一个if判断对象是否实例化，只有非实例化之后才能进入if块进行枪锁
        if (singletonDoubleCheckLock == null) {
               //添加同步代码块
                synchronized (SingletonDoubleCheckLock.class){
                    /**
                     * 第二个if判断，当一次实例化，线程A，和线程B，都进入了一个if,
                     *      线程A强到锁，实例化对象，操作完后，线程B也拿到锁，
                     *      此时的第二个if判断语句，就是保证实例化的对象的唯一性，
                     */
                    if (singletonDoubleCheckLock == null) {
                        singletonDoubleCheckLock=new SingletonDoubleCheckLock();
                    }
                }
        }
        return singletonDoubleCheckLock;
    }
}
