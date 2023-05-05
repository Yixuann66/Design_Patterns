package com.dengyixuan.structural.proxy.static_proxy;/**
 * @Author 85067
 * @create 05/05/2023 16:07
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 客户端
 * @date 05/05/2023 16:07
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        // 代售点进行卖票
        proxyPoint.sell();

    }
}
