package com.dengyixuan.builder.factory.factorymethod;/**
 * @Author 85067
 * @create 04/05/2023 17:16
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 04/05/2023 17:16
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore coffeeStore= new CoffeeStore();
        // 创建对象
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();

        coffeeStore.setFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getClass());
        System.out.println(coffee.getName());
        //class com.dengyixuan.builder.factory.factorymethod.AmericanCoffee
    }
}
