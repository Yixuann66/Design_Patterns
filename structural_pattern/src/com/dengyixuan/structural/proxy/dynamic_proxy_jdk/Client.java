package com.dengyixuan.structural.proxy.dynamic_proxy_jdk;/**
 * @Author 85067
 * @create 05/05/2023 16:08
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 05/05/2023 16:08
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        // 使用factory对象的方法获取代理对象
        SellTickets proxyFactoryProxyObject = proxyFactory.getProxyObject();
        proxyFactoryProxyObject.sell();

        proxyFactoryProxyObject.unsell();

        System.out.println(proxyFactoryProxyObject);
        System.out.println(proxyFactoryProxyObject.getClass());


    }
}
