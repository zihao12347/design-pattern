package com.design.pattern.creationpattern.factorypattern.simplefactory;

/**
 * @Author:aaa
 * @Date:11:38
 * @Version 1.0
 */

/**
 * 简单工厂模式-静态工厂方法模式：用于创建的产品种类不多，只需要一个工厂类就可以完成
 *      简单工厂模式的优点：
 *      降低程序之间的耦合度，
 *
 *      缺点：
 *          1.简单工厂模式，单一的工厂类，负责所有产品的创建，一旦职责过重，工厂类代码会非常臃肿，违背高举合原则
 *          2.系统扩展难，一旦增加新产品不得不修改工厂逻辑,违背了开闭原则
 *          3.简单工厂使用的是static工厂方法，造成工厂角色无法继承
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(SimpleFactory.getProduce(1));
    }

    /**
     * 抽象产品：用于定义或描述产品的特性和功能
     */
    public interface Produce{
        //定义产品的功能
        public String show();
    }

    /** 具体产品A
     * 具体产品：是工厂创建的目标对象
     */
    public static class ConcreteProduceA implements Produce{
        /**
         * 描述具体产品具体功能
         * @return
         */
        public String show() {
            return "产品A";
        }
    }

    /**
     * 具体产品B
     */
    public static class ConcreteProduceB implements Produce{
        /**
         * 描述具体产品具体功能
         * @return
         */
        public String show() {
            return "产品B";
        }
    }

    final static class Const{
        public static final int ProduceA=1;
        public static final int ProduceB=2;
    }

    /**
     * 具体工厂：负责提供创建产品对象的方法
     */
    public static class SimpleFactory{
        public static Produce getProduce(int type){
           switch (type){
               case Const.ProduceA :
                   return new ConcreteProduceA();
               case Const.ProduceB :
                   return new ConcreteProduceB();
           }
            return null;
        }
    }


}
