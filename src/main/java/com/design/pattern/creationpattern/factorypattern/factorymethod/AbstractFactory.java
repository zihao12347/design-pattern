package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:15:58
 * @Version 1.0
 */

/**
 * 抽象工厂： 定义了创建产品对象的方法
 */
public interface AbstractFactory {
    /**
     * 定义创建产品对象的方法
     * @return
     */
    public AbstractProduct createConcreteProduct();
}
