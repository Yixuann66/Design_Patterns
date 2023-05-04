package com.dengyixuan.builder.factory.factorymethod;/**
 * @Author 85067
 * @create 04/05/2023 17:13
 */

/**
 * @author 85067
 * @version 1.0
 * @description: latte咖啡工厂
 * @date 04/05/2023 17:13
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    /**
     * 创建咖啡对象的方法
     *
     * @return coffee的实例
     */
    @Override
    public Coffee createCoffee() {

        return new LatteCoffee();
    }
}
