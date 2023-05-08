package com.dengyixuan.structural.facade;/**
 * @Author 85067
 * @create 08/05/2023 11:56
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 通过SmartApplicationFacade来操作子系统
 * @date 08/05/2023 11:56
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationFacade smartApplicationFacade = new SmartApplicationFacade();
        smartApplicationFacade.say("打开全部");
        smartApplicationFacade.say("关闭全部");
    }
}
