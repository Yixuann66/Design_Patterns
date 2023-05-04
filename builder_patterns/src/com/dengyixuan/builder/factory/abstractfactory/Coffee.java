package com.dengyixuan.builder.factory.abstractfactory;/**
 * @Author 85067
 * @create 04/05/2023 15:52
 */

/**
 * @author 85067
 * @version 1.0
 * @description:
 * @date 04/05/2023 15:52
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
