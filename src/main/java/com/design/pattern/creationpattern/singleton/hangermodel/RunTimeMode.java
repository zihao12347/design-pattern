package com.design.pattern.creationpattern.singleton.hangermodel;

/**
 * @Author:aaa
 * @Date:9:43
 * @Version 1.0
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * JDK源码解析-Runtime类，
 *      从Runtime源码中可以看出Runtime类使用的是饿汉模式(静态属性方式)
 *
 */
public class RunTimeMode {
    public static void main(String[] args) throws IOException {
        //获取runtime实例对象
        Runtime runtime = Runtime.getRuntime();
        //返回java虚拟机中的内存总量
        System.out.println(runtime.totalMemory());
        //返回java虚拟机中试图使用的最大内存
        System.out.println(runtime.maxMemory());
        //exec()方法执行指定的字符串命令，返回进程对象
        Process process = runtime.exec("ipconfig");
        //获取命令执行后的结果，通过输入流获取,读出执行的结果
        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 100];
        int i = inputStream.read(bytes);
        System.out.println(new String(bytes,0,i,"gbk"));


    }
}
