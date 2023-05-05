package com.dengyixuan.builder.builder;/**
 * @Author 85067
 * @create 04/05/2023 19:02
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 建造者模式 yixuandeng的分支，用于测试git
 * <p>
 * 优点：封装性很好，可以封装变化，将主要业务逻辑封装在指挥者类，产品者和建造者类比较稳定的
 * 客户端不需要知道细节，只需要通过指挥者构建产品
 * 容易扩展，创建新的建造者类即可
 * <p>
 * 缺点：产品差异大，就不适合使用建造者
 * @date 04/05/2023 19:02
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike mobile = director.construct();
        System.out.println(mobile.getFrame());
        System.out.println(mobile.getSeat());
    }
}
