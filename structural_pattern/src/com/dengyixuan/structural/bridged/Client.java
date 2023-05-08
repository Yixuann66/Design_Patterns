package com.dengyixuan.structural.bridged;/**
 * @Author 85067
 * @create 06/05/2023 16:21
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 桥接模式
 * <p>
 * 桥接模式（Bridge Pattern），也叫做桥梁模式，结构型设计模式的一种，这个模式相对来说有些难理解。桥接，顾名思义，就是用来连接两个部分，为被分离了的抽象部分和实现部分搭桥。
 * <p>
 * 官方一点的说法叫：将抽象部分与它的实现部分分离，使它们都可以独立变化。
 * <p>
 * 还有另外一种理解方式：一个类存在两个（或多个）独立变化的维度，我们通过组合的方式，让这两个（或多个）维度可以独立进行扩展。
 * @date 06/05/2023 16:21
 */
public class Client {

    public static void main(String[] args) {
        OperatingSystem mac = new Mac(new AVIFile());
        mac.play("视频文件");
        OperatingSystem mac1 = new Mac(new RmvbFile());
        mac1.play("视频文件");

        OperatingSystem windows = new Windows(new AVIFile());
        windows.play("视频文件");


    }
}
