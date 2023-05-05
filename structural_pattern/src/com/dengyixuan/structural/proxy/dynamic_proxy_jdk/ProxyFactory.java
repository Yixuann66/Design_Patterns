package com.dengyixuan.structural.proxy.dynamic_proxy_jdk;/**
 * @Author 85067
 * @create 05/05/2023 16:50
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @author 85067
 * @version 1.0
 * @description: jdk动态代理，获取代理对象的工厂类 基于接口的，代理类也实现了接口
 * @date 05/05/2023 16:50
 */
public class ProxyFactory {


    /**
     * 声明目标对象
     */
    private TrainStation trainStation = new TrainStation();

    /**
     * 返回代理对象 Proxy.newProxyInstance(
     * ClassLoader loader, 类加载器 用于加载代理类 代理类在程序运行中动态生成的代理类
     * 通过目标对象获取类加载器
     * Class<?>[] interfaces, 代理类实现的接口的字节码对象
     * InvocationHandler h 代理对象的调用处理程序
     * );
     *
     * @return
     */
    public SellTickets getProxyObject() {
        SellTickets proxyInstance = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName());
//                        if (Objects.equals(method.getName(),"sell")){
//                            System.out.println("sell票之前");
//                            Object invoke = method.invoke(trainStation, args);
//
//                        }else {
//                            method.invoke(args);
//                        }
                        if (method.getName().equals("sell")) {
                            System.out.println("sell票之前");
                            Object invoke = method.invoke(trainStation, args);
                            System.out.println("sell票之后");
                        } else {
                            Object invoke = method.invoke(trainStation, args);
                        }


                        return null;
                    }
                }
        );

        return proxyInstance;
    }
}
