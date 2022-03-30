package com.design.pattern.creationpattern.singleton.lazymodel;

/**
 * @Author:aaa
 * @Date:11:36
 * @Version 1.0
 */

/**
 * 单例模式-静态内部类方式
 *      静态内部类方式方式：对象由静态内部类创建，由于jvm在加载外部类时，不会加载内部类，
 *      只有当内部类的属性/方法被调用时，才会加载内部类，并且初始化其静态属性，由于静态内部类
 *      的属性被static修饰，所以该属性只能被实例化一次。
 *
 *       *第一次加载外部类SingletonStaticInnerClass时，是不会加载期内部类并初始化单例对象，
 *       只有第一次调用该内部类的属性/方法时，虚拟机才会加载，并保持该实例对象在内存中，
 *       这样不仅能保证：实例对象的线程安全，单例性，性能（当调用外部单例类实例对象方法时，才初始化单例对象）问题等
 *
 *
 *
 */
public class SingletonStaticInnerClass {
    /**
     * 私有构造方法，避免外部创建对象，保证单例特性
     */
   private SingletonStaticInnerClass(){}

    /**
     * 静态内部类：
     *        创建单例对象
     */
    private static class StaticInnerClass{
        private static SingletonStaticInnerClass singletonStaticInnerClass=new SingletonStaticInnerClass();
    }

    /**
     * 静态获取实例对象方法
     * @return
     */
    public static SingletonStaticInnerClass getInstance(){
        return StaticInnerClass.singletonStaticInnerClass;
    }
}
