package com.design.pattern.creationpattern.singleton.hangermodel;

/**
 * @Author:aaa
 * @Date:14:28
 * @Version 1.0
 */

/**
 * 饥汉模式-枚举方式
 *      枚举方式是极力推荐实现单例模式，因为枚举类型是线程安全的，并且只会装载一次，
 *      设计者利用枚举特性，实现单例模式，
 *      枚举方式-是单例模式中唯一不会被破坏的单例实现模式
 *
 *
 *       *枚举：枚举类是一个特殊的类，java中每个枚举类型都继承了java.lang.enum类，每个枚举都是enum类型
 *                枚举类的枚举成员，默认被public static final 修饰，
 *       *枚举如何保证线程安全:
 *            每一个枚举类都继承了java.lang.enum类，同时被final修饰的，因此枚举类型是不可被继承的，
 *            枚举类的枚举成员都被static修饰，每个枚举项都是枚举类的实例对象、
 *            因为static类型的属性会在类加载后被初始化，当一个类第一次使用到了静态资源时被初始化，
 *            因为java类加载和初始化都是线程安全的。
 *
 */
public enum  SingletonEnum {
    SINGLETON_ENUM
}
