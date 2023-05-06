package com.dengyixuan.structural.decorator;/**
 * @Author 85067
 * @create 06/05/2023 15:53
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 装饰者类 抽象装饰角色
 * @date 06/05/2023 15:53
 */
public abstract class Garnish extends FastFood {

//    public Garnish(FastFood fastFood) {
//        this.fastFood = fastFood;
//    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    // 聚合
    private FastFood fastFood;
}
