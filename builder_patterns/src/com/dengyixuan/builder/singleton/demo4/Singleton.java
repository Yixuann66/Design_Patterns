package com.dengyixuan.builder.singleton.demo4;/**
 * @Author 85067
 * @create 04/05/2023 15:12
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 懒汉式 静态内部类方式 推荐，第一次调用getInstance，虚拟机加载SingletonHolder的静态内部类，并且初始化Instance，而且线程安全
 *
 *
 *  类加载方法：使用了Synchronized同步，除非重写，不然类的加载是线程安全的
 *  protected Class<?> loadClass(String name, boolean resolve)
 *         throws ClassNotFoundException
 *     {
 *         synchronized (getClassLoadingLock(name))
 *
 *  JVM 在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性/方法被调用时才会被加载，并且初始化其静态属性
 *      static修饰，保证只能被实例化一次，并且严格保证实例化顺序
 *
 * @date 04/05/2023 15:12
 */
public class Singleton {
    /**
     *     1. 私有构造方法
     */
    private Singleton(){}

    /**
     * 2. 静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 3. 调用静态内部类 才会进行加载，并且初始化其静态属性
     * @contract(pure = true) 是Python中的一个装饰器，用于标记一个函数为纯函数。
     * 纯函数是指在相同的输入下，总是返回相同的输出，且没有副作用的函数。
     * 使用 @contract(pure = true) 可以帮助开发者更好地理解和维护代码，同时也可以提高代码的可读性和可维护性。
     * @return SingletonHolder.INSTANCE
     */
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
