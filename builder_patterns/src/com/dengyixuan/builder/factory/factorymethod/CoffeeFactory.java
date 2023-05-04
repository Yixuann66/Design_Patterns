package com.dengyixuan.builder.factory.factorymethod;

/**
 * @Author 85067
 * @create 04/05/2023 17:07
 */

/**
 * 属于抽象工厂角色
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡对象的方法
     * @return coffee的实例
     */
    Coffee createCoffee();


}
