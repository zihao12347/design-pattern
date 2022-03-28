package com.design.pattern.creationpattern.singleton.hangermodel;

/**
 * 饥汉模式：方式2
 *       在静态代码块中创建该类对象
 *
 *       *极汉模式-静态代码块中创建对象，也是随着类的加载而被创建，也存在着内存浪费
 */
public class SingletonStaticCodeBlock {
    /**
     * 私有构造方法：避免类在外部被实例化，确保该类只有一个对象被创建，
     */
    private SingletonStaticCodeBlock() {
    }
    //声明该类对象
    private static SingletonStaticCodeBlock singletonStaticCodeBlock;

    //静态代码块创建该类对象
    static {
        singletonStaticCodeBlock=new SingletonStaticCodeBlock();
    }

    /**
     * 对外提供静态方法获取该类对象
     * @return
     */
    public SingletonStaticCodeBlock getInstant(){
        return singletonStaticCodeBlock;
    }
}
