package com.dengyixuan.structural.facade;/**
 * @Author 85067
 * @create 08/05/2023 11:52
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 用户外观类，主要和用户打交道
 * @date 08/05/2023 11:52
 */
public class SmartApplicationFacade {
    // 聚合电灯，电视机等子系统里面的对象
    private Light light;
    private TV tv;
    private Airconditioner airconditioner;

    public SmartApplicationFacade() {
        light = new Light();
        tv = new TV();
        airconditioner = new Airconditioner();
    }

    /**
     * 语音控制
     *
     * @param message
     */
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("听不懂");
        }
    }

    /**
     * 一键打开功能
     */
    private void on() {
        light.on();
        tv.on();
        airconditioner.on();
    }

    /**
     * 一键关闭
     */
    private void off() {
        light.off();
        tv.off();
        airconditioner.off();
    }

}
