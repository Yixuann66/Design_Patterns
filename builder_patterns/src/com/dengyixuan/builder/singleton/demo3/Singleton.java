package com.dengyixuan.builder.singleton.demo3;/**
 * @Author 85067
 * @create 04/05/2023 14:58
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 懒汉式
 *
 *
 * @date 04/05/2023 14:58
 */
public class Singleton {

    private  Singleton(){

    }

    private static volatile Singleton INSTANCE;


    public static Singleton getInstance(){
        // 创建 加双检锁 + volatile防止指令重排
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
