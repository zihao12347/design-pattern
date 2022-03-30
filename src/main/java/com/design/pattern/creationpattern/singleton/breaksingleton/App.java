package com.design.pattern.creationpattern.singleton.breaksingleton;

/**
 * @Author:aaa
 * @Date:15:53
 * @Version 1.0
 */

import java.io.Serializable;

/**
 * 单例模式存在的问题：
 *      破坏单例模式-除了枚举方式的饿汉单例模式不可被破快之外，其他方式的单例模式都是可以被破坏
 *
 *      破环单例模式方式----2种
 *      1)序列化、反序列化方式：
 *
 *      *序列化：将java对象转换成字节序列的过程，
 *             作用是将java对象转化成有序的字节流，便于在网络传输，和保存在本地
 *      *反序列化：将字节序列恢复成java对象过程
 *             作用是将字节流中保存的对象状态和描述消息，通过反序列化重构成java对象
 *
 *
 *
 */
public class App implements Serializable {
}
