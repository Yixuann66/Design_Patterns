package com.dengyixuan.structural.decorator;/**
 * @Author 85067
 * @create 06/05/2023 15:55
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体的装饰者类
 * @date 06/05/2023 15:55
 */
public class Egg extends Garnish {


    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {

        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
