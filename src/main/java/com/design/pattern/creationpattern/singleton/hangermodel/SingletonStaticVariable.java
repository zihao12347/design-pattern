package com.design.pattern.creationpattern.singleton.hangermodel;

/**
 * 饥汉方式一：
 *      静态变量创建类的对象
 *
 *    *这种静态变量创建对象方式，是随着类的加载对象也被创建出来，如果该对象足够大，
 *      并且一直没有被使用就会造成内存的浪费
 */
public class SingletonStaticVariable {
    /**
     * 提供私有构造方法
     */
    private SingletonStaticVariable() {
    }
    //在成员位置的时候创建该类的对象
    private static SingletonStaticVariable singleton=new SingletonStaticVariable();

    /**
     * 对外提供全局的方法，获取该对象
     * @return
     */
    public static SingletonStaticVariable getInstance(){
        return singleton;
    }
}
