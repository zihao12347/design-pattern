package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:16:00
 * @Version 1.0
 */

/**
 * 具体工厂A：实现抽象工厂创建产品对象的方法
 */
public class ConcreteFactoryA implements AbstractFactory {
    public AbstractProduct createConcreteProduct() {
        return new ConcreteProductA() ;
    }
}
