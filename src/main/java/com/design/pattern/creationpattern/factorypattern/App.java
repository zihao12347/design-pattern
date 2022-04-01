package com.design.pattern.creationpattern.factorypattern;

/**
 * @Author:aaa
 * @Date:18:21
 * @Version 1.0
 */

/**
 * 创建者模式----工厂模式
 *       工厂模式：定义一个创建产品对象的工厂接口，将产品对象的具体创建交给子工厂类，
 *                实现创建者模式的“对象的创建和使用分离”的特点，解耦特的特点
 *
 *       工厂模式的实现方式：3种
 *          1.简单工厂
 *          2.抽象工厂
 *          3.工厂方法
 *
 *          产品：被创建出来的对象
 *         工厂：用于创建产品的对象
 *
 *       简单工厂模式：创建的产品不多，只需要一个工厂类就可以完成
 *           创建实例方法：通过为static方法，所以简单工厂也叫静态工厂方法模式
 *
 *           简单工厂模式属于创建型模式，但是不属于23种经典设计模式中，更多的是一直编程习惯
 *
 *      工厂方法模式：是对简单工厂进一步抽象化的实现，好处就是在不修改源代码基础上引入新产品
 *                  实现避开原则。
 *
 *
 *
 */
public class App {
}
