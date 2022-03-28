package com.design.pattern.creationpattern.singleton.lazymode;

/**
 * 懒汉模式：方式一
 *            线程不安全模式
 *
 *     *懒汉模式 ~ 线程不安全：当调用了getInstant()全局创建对象的方法时，对象才被创建，
 *                  但是如果出现在多线程环境下，可能会出现现在安全问题
 */
public class SingletonNotSafeThread {
    /**
     * 私有构造方法：避免外部实例化该类对象，确保创建唯一的对象
     */
    private SingletonNotSafeThread() {
    }
    //在成员变量位置中声明该对象
    private static SingletonNotSafeThread singletonNotSafeThread;

    /**
     * 对外提供全局的访问对象方法，
     * @return
     */
    public SingletonNotSafeThread getInstant(){
        if (singletonNotSafeThread == null) {//当singletonNotSafeThread对象空才创建
            new SingletonNotSafeThread();
        }
        return singletonNotSafeThread;
    }
}
