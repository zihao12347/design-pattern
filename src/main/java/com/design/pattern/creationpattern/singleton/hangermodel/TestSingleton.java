package com.design.pattern.creationpattern.singleton.hangermodel;

/**
 * @Author:aaa
 * @Date:15:04
 * @Version 1.0
 */
public class TestSingleton {
    public static void main(String[] args) {
        SingletonEnum singletonEnum1 = SingletonEnum.SINGLETON_ENUM;
        SingletonEnum singletonEnum2 = SingletonEnum.SINGLETON_ENUM;
        System.out.println(singletonEnum1==singletonEnum2);
    }
}
