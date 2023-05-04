package com.dengyixuan.builder.factory.abstractfactory;/**
 * @Author 85067
 * @create 04/05/2023 17:23
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 04/05/2023 17:23
 */
public class Client {
    public static void main(String[] args) {
        // 创建意大利风味
        DessertFactory italyDessertFactory = new ItalyDessertFactory();
        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();
        System.out.println(coffee.getName());
        System.out.println(dessert.getClass());

    }
}
