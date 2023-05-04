package com.dengyixuan.builder.factory.simplefactory;/**
 * @Author 85067
 * @create 04/05/2023 16:03
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 简单工厂模式，不属于设计模式
 *  抽象产品
 *  具体产品
 *  具体工厂，提供创建产品的方法，调用者通过该方法获取产品
 *
 *  通过调用简单工厂方法获取对象，实现和对象的解耦
 *
 *  有点：对象的创建（简单工厂）和业务逻辑分开（咖啡店），避免修改客户代码，实现新的产品只需要修改工厂类，而不再原代码中修改
 *  缺点：添加新的产品，需要修改工厂类的代码，违背了开闭原则
 * @date 04/05/2023 16:03
 */
public class CoffeeShop {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
