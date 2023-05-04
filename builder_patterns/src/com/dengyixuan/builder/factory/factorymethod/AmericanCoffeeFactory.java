package com.dengyixuan.builder.factory.factorymethod;/**
 * @Author 85067
 * @create 04/05/2023 17:12
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 美式咖啡工厂对象，专门用来生产美式咖啡
 * @date 04/05/2023 17:12
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    /**
     * 创建咖啡对象的方法
     *
     * @return coffee的实例
     */
    @Override
    public Coffee createCoffee() {

        return new AmericanCoffee();
    }
}
