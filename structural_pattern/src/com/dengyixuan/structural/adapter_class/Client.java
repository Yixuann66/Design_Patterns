package com.dengyixuan.structural.adapter_class;/**
 * @Author 85067
 * @create 05/05/2023 18:30
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 适配器，将一个类的接口转换成用户希望的另外一个接口 类适配（耦合度高，继承 应用少）和对象适配器
 * <p>
 * 适配器是一个转换器，通过//继承或引用//适配者的对象，把适配者接口转换为目标接口，让客户按照目标接口的格式访问适配器
 * <p>
 * 适配者  --> 经过适配器adapter --> 转化为 目标接口（用户期望的接口）
 * <p>
 * 使用适配器adapter读取sd卡里面的内容，原来的卡是TFcard
 * <p>
 * computer只能使用sd卡，所以需要将tfcard转换为sd卡进行读取 不能直接将TFcard传给computer进行数据读取
 * <p>
 * 类适配器要有接口规范的时候才可以使用
 * @date 05/05/2023 18:30
 */
public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer();

        String s = computer.readSD(new SDCardImpl());

        System.out.println(s);

        System.out.println("===============");

        // 使用该电脑读取tf卡中的数据
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);

    }
}
