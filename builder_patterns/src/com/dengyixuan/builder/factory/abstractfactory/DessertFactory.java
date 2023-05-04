package com.dengyixuan.builder.factory.abstractfactory;

/**
 * @Author 85067
 * @create 04/05/2023 17:39
 */

/**
 * 抽象工厂
 */
public interface DessertFactory {

    /**
     * 生产咖啡的功能
     * @return
     */
    Coffee createCoffee();

    /**
     * 生产甜品的功能
     * @return
     */
    Dessert createDessert();
}
