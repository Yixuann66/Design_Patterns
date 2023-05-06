package com.dengyixuan.structural.decorator;/**
 * @Author 85067
 * @create 06/05/2023 15:50
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 06/05/2023 15:50
 */
public class FriesRice extends FastFood {

    public FriesRice() {

        super(10, "炒饭");
    }

    @Override
    public float cost() {

        return getPrice();
    }
}
