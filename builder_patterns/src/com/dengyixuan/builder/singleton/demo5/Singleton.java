package com.dengyixuan.builder.singleton.demo5;/**
 * @Author 85067
 * @create 04/05/2023 15:34
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 枚举类实现单例模式：极力推荐的饿汉式单例模式
 *
 *  枚举类型是线程安全的，并且只会加载一次
 *  枚举类创建的INSTANCE:   class com.dengyixuan.builder.singleton.demo5.Singleton
 *
 * @date 04/05/2023 15:34
 */
public enum Singleton {
    INSTANCE;

}
