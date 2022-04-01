package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:15:55
 * @Version 1.0
 */

/**
 * 具体产品B，实现抽象产品定义的功能或属性
 */
public class ConcreteProductA implements AbstractProduct {
    public String show() {
        return "具体产品B！";
    }
}
