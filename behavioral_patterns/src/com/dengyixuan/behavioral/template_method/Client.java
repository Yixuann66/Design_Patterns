package com.dengyixuan.behavioral.template_method;/**
 * @Author 85067
 * @create 08/05/2023 15:54
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 模板方法模式 定义一个算法的骨架（父类），具体的算法实现由其子类来产生
 * <p>
 * 抽象类
 * 给出算法的轮廓和股价
 * 按某种顺序调用其包含的基本方法
 * 一个模板方法和若干基本方法构成
 * <p>
 * 基本方法：抽象方法，具体方法，钩子方法
 * <p>
 * 具体子类
 * 实现抽象类定义的钩子方法和抽象方法
 * @date 08/05/2023 15:54
 */
public class Client {

    public static void main(String[] args) {

        AbstractClass abstractClass = new ConcreteClassBaoCai();
        abstractClass.cookProcess();

    }
}
