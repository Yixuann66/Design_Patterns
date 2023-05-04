package com.dengyixuan.builder.singleton.demo3;/**
 * @Author 85067
 * @create 04/05/2023 14:39
 */


/**
 * @author 85067
 * @version 1.0
 * @description: 饿汉式 测试
 * @date 04/05/2023 14:39
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance =  Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 判断两个对象是否是同一个对象
        System.out.println(instance == instance2);
        System.out.println(instance);
        System.out.println(instance2);
    }

}
