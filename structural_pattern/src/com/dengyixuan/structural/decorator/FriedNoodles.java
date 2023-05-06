package com.dengyixuan.structural.decorator;/**
 * @Author 85067
 * @create 06/05/2023 15:51
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体构建类
 * @date 06/05/2023 15:51
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "noodles");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
