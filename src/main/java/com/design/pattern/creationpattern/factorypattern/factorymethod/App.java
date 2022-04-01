package com.design.pattern.creationpattern.factorypattern.factorymethod;

/**
 * @Author:aaa
 * @Date:14:52
 * @Version 1.0
 */

/**
 * 工厂方法：工厂方法模式是对简单工厂模式进一步抽象化，好处就是在不修改源代码的基础上引入新产品，
 *          满足开闭原则
 *
 *      工厂方法的模式优缺点：
 *          优点：
 *              灵活性增强，对新产品的创建，只需要写一下相应的工厂类
 *              典型的解耦框架，高层模块只需要知道产品的抽象类，不需关心其他实现类
 *          缺点：
 *              增加复杂性，类的个数容易过多，
 *              增加理解难道，系统抽象性比较高
 *
 *       工厂方法模式包含的角色
 *          抽象工厂：提供创建产品的接口，调用者通过抽象工厂调用具体工厂的工厂方法，创建产品对象
 *          具体工厂：完成具体产品的创建，实现抽象工厂创建产品的方法
 *          抽象产品：定义产品的属性和功能
 *          具体产品：是工厂创建的目前对象
 */
public class App {
}
