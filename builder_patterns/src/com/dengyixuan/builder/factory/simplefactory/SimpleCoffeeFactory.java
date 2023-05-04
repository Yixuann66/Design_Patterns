package com.dengyixuan.builder.factory.simplefactory;/**
 * @Author 85067
 * @create 04/05/2023 16:13
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 简单工厂模式，不属于设计模式
 *  抽象产品
 *  具体产品
 *  具体工厂，提供创建产品的方法，调用者通过该方法获取产品
 * @date 04/05/2023 16:13
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;

        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，没有{msg}coffee");
        }

//        coffee.addMilk();
//        coffee.addSugar();
        return coffee;
    }
}
