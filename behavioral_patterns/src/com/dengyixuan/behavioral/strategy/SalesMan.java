package com.dengyixuan.behavioral.strategy;/**
 * @Author 85067
 * @create 08/05/2023 16:52
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 环境类 context
 * @date 08/05/2023 16:52
 */
public class SalesMan {

    /**
     * 聚合策略类对象
     */
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 由促销员展示促销活动给普通用户
     */
    void salesmanShow() {
        strategy.show();
    }
}
