package com.dengyixuan.behavioral.strategy;/**
 * @Author 85067
 * @create 08/05/2023 16:53
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体策略类 封装算法的
 * @date 08/05/2023 16:53
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一促销算法");

    }
}
