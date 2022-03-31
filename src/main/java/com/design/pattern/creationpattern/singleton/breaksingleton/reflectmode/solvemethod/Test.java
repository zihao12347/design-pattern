package com.design.pattern.creationpattern.singleton.breaksingleton.reflectmode.solvemethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author:aaa
 * @Date:18:34
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Singleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println((Singleton) constructor.newInstance());
        System.out.println((Singleton) constructor.newInstance());
    }
}
