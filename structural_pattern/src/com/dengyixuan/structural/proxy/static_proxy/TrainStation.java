package com.dengyixuan.structural.proxy.static_proxy;/**
 * @Author 85067
 * @create 05/05/2023 16:04
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 火车站进行卖票
 * @date 05/05/2023 16:04
 */
public class TrainStation implements SellTickets {


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
