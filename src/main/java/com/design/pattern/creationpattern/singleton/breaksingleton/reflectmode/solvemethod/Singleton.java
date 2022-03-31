package com.design.pattern.creationpattern.singleton.breaksingleton.reflectmode.solvemethod;

/**
 * @Author:aaa
 * @Date:14:18
 * @Version 1.0
 */

/**
 *  懒汉模式----双重检查锁方式
 */
public class Singleton {
    //声明静态全局变量
    private static Singleton singleton;
    //声明静态flag变量
    private static Boolean flag=false;

    /**
     * 私有构造方法，避免外部创建该单例类对象
     *
     *        解决反射破坏单例模式：当第二次通过反射的构造方法对象创建实例时，抛出异常，不执行创建实例操作
     */
    private Singleton(){
        synchronized (Singleton.class){//保证线程安全
            if (flag) {//当flag为true时，表示单例类已被创建，
                throw new RuntimeException("单例对象已存在！");
            }
            //flag为false时，表示第一次可以通过反射创建该单例类的实例对象
            flag=true;
        }

    }

    /**
     * 对外部提供公共获取单例对象方法
     * @return
     */
    public static Singleton getInstance(){
        //判断单例对象是否为null，为空创建单例对象，否则直接返回
        if (singleton==null){
            //同步代码块，保证线程的安全性
            synchronized (Singleton.class){
                    //再次判断单例对象是否为空，在多线程情况下保证单例特性
                    if (singleton==null) {
                        singleton=new Singleton();
                        flag=true;
                    }
            }
        }
        return singleton;
    }
}
