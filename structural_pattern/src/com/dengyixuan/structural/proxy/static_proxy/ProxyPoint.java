package com.dengyixuan.structural.proxy.static_proxy;/**
 * @Author 85067
 * @create 05/05/2023 16:05
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 代售点类，聚合火车站的卖票
 * @date 05/05/2023 16:05
 */
public class ProxyPoint implements SellTickets {

    /**
     * 声明火车站类对象
     */
    private TrainStation trainStation = new TrainStation();

    /**
     * 进行增强 收取一些服务费用
     */
    @Override
    public void sell() {
        System.out.println("代理点收你10块钱");
        trainStation.sell();
        System.out.println("卖票完毕");

    }
}
