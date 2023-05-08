package com.dengyixuan.structural.flyweight;/**
 * @Author 85067
 * @create 08/05/2023 15:36
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 抽象享元角色
 * @date 08/05/2023 15:36
 */
public abstract class AbstractBox {

    /**
     * @return
     */
    public abstract String getShape();

    /**
     * 显示图形及颜色
     *
     * @param color
     */
    public void display(String color) {
        System.out.println("方块的形状和颜色是：" + getShape() + color);
    }

}
