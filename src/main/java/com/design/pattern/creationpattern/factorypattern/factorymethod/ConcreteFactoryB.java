package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:16:07
 * @Version 1.0
 */

/**
 * 具体工厂B：实现抽象工厂定义的创建产品对象的方法，完成产品对象的具体创建
 */
public class ConcreteFactoryB implements AbstractFactory{

    public AbstractProduct createConcreteProduct() {
        return new ConcreteProductB();
    }
}
