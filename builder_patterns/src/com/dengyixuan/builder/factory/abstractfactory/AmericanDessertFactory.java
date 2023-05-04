package com.dengyixuan.builder.factory.abstractfactory;/**
 * @Author 85067
 * @create 04/05/2023 17:42
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 美式风味的甜品工厂实现类 生产美式咖啡和抹茶慕斯
 * @date 04/05/2023 17:42
 */
public class AmericanDessertFactory implements DessertFactory{
    /**
     * 生产咖啡的功能
     *
     * @return
     */
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    /**
     * 生产甜品的功能
     *
     * @return
     */
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
