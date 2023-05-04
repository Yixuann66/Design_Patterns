package com.dengyixuan.builder.factory.abstractfactory;/**
 * @Author 85067
 * @create 04/05/2023 17:47
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 工厂方法实现类
 * @date 04/05/2023 17:47
 */
public class ItalyDessertFactory implements DessertFactory{
    /**
     * 生产咖啡的功能
     *
     * @return
     */
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    /**
     * 生产甜品的功能
     *
     * @return
     */
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
