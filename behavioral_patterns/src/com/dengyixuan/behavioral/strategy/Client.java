package com.dengyixuan.behavioral.strategy;/**
 * @Author 85067
 * @create 08/05/2023 16:50
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 策略模式，将每个算法封装起来，算法的变化（使用不同的算法）不影响使用算法的客户 对象行为模式
 * <p>
 * 抽象策略
 * <p>
 * 具体策略（concrete strategy）
 * <p>
 * 环境（context）
 * <p>
 * 例子：Comprator的策略模式
 * <p>
 * Arrays的sort()方法
 * 可以指定使用哪一种sort算法
 * @date 08/05/2023 16:50
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 使用a算法来进行
         */
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesmanShow();

        /**
         * 使用b算法来进行
         */
        SalesMan salesMan1 = new SalesMan(new StrategyB());
        salesMan1.salesmanShow();
    }
}
