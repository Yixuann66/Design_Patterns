package com.dengyixuan.builder.factory.simplefactory;/**
 * @Author 85067
 * @create 04/05/2023 16:06
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 04/05/2023 16:06
 */
public class Client {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        // 点咖啡
        Coffee latte = coffeeShop.orderCoffee("latte");
        System.out.println(latte.getName());

        Coffee american = coffeeShop.orderCoffee("american");
        System.out.println(american.getName());
    }
}
