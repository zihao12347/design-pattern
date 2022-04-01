package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:17:49
 * @Version 1.0
 */
public class Factory {
    private AbstractFactory abstractFactory;
    public Factory(AbstractFactory abstractFactory){
        this.abstractFactory=abstractFactory;
    }
    public AbstractProduct createProduct(){
        AbstractProduct product = abstractFactory.createConcreteProduct();
        return product;
    }
}
