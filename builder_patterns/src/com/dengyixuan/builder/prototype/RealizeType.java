package com.dengyixuan.builder.prototype;

/**
 * @author 85067
 * @version 1.0
 * @description: Cloneable:抽象原型类 实现潜克隆
 * @date 04/05/2023 18:21
 */
public class RealizeType implements Cloneable {



    @Override
    public RealizeType clone() throws CloneNotSupportedException {

        System.out.println("开始克隆");
        return (RealizeType) super.clone();
    }
}
