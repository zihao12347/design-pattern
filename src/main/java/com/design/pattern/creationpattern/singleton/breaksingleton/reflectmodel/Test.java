package com.design.pattern.creationpattern.singleton.breaksingleton.reflectmodel;

/**
 * @Author:aaa
 * @Date:16:40
 * @Version 1.0
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 破坏单例对象方式二----通过反射方式破快
 *                      通过反射，改变私有构造方法的访问安全检查，从而通过反射的构造器对象创建新的实例破坏单例模式
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class singletonClass = Singleton.class;//获取单例类的class对象
        Constructor declaredConstructor = singletonClass.getDeclaredConstructor();//获通过参数类型获取对应构造方法
        declaredConstructor.setAccessible(true);//setAccessible()方法，设置class对象，获取方法或属性时是否取消安全检查
        //通过class对象创建实例对象
        Singleton instance1 = (Singleton)declaredConstructor.newInstance();
        Singleton instance2 = (Singleton) declaredConstructor.newInstance();
        System.out.println(instance1==instance2);
    }
}
