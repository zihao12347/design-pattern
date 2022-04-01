package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:17:51
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory(new ConcreteFactoryB());
        AbstractProduct product = factory.createProduct();
        System.out.println(product.show());
    }
}
