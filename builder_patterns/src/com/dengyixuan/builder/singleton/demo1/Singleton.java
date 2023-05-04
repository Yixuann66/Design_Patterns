package com.dengyixuan.builder.singleton.demo1;/**
 * @Author 85067
 * @create 04/05/2023 14:34
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 饿汉式单例：静态成员变量
 * @date 04/05/2023 14:34
 */
public class Singleton {

    //1. 私有构造方法
    private Singleton(){
    }

    //2. 在本类中创建本类对象
    private static Singleton instance = new Singleton();

    //3. 公共的静态访问方法 让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }


}
