package com.dengyixuan.builder.factory.factorymethod;/**
 * @Author 85067
 * @create 04/05/2023 16:11
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 工厂方法模式，解决开闭原则，工厂方法使得一个产品类的实例化延迟到其工厂的子类。
 *
 *
 * 抽象工厂 - 具体工厂 将工厂也抽象化，利用各种工厂多态的实现这个抽象工厂
 * 抽象产品 - 具体产品 具体产品和具体工厂一一对应
 *
 * 依赖倒转原则
 *
 * @date 04/05/2023 16:11
 */

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    /**
     * 点咖啡功能
     * @return
     */
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
