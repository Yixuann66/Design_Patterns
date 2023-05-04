package com.dengyixuan.builder.singleton.demo2;/**
 * @Author 85067
 * @create 04/05/2023 14:42
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 饿汉式静态代码块方式
 *
 * 在同一个类中，常量（public static final）会在其余的静态代码（静态变量的声明、赋值，静态代码块）之前就完成声明和赋值，
 *      -其余的静态代码（静态变量的声明、赋值，静态代码块）会自上而下执行，
 *      -也就是说静态代码块只能能调用在它之前声明的静态变量，不能调用在它之后声明的静态变量。
 * 在继承关系中先执行父类的静态代码，然后执行子类的静态代码，而且这些操作都会在类加载的时候就完成。
 * 而静态方法则会等到被调用的时候，才会被加载到栈中执行。
 *
 * final关键字修饰变量
 * （1）类加载时执行顺序 static代码块>代码块>构造器
 *
 * 该关键字可以在定义时赋值，可以在静态代码块中赋值，可以在代码块中赋值(static final 只能在静态代码块赋值)，以及在构造器中赋值。
 *
 * 必须要有值
 *
 * （2）如果是基本数据类型的数据，该变量一旦赋值，便相当于一个常量。
 *
 * （3）如果是引用数据类型的变量，初始化后不能更改他的引用，但可以更改引用对象的值。
 */
public class Singleton {

    /**
     * 1. 私有构造方法
     */
    private Singleton(){}

    /**
     * 2. 声明Singleton类型的变量
     */
    private static final Singleton INSTANCE;

    /**
     * 在静态代码块赋值
     */
    static {
        INSTANCE = new Singleton();
    }

    /**
     * 提供获取对象的方法
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }




}
