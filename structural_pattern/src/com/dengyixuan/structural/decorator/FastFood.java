package com.dengyixuan.structural.decorator;/**
 * @Author 85067
 * @create 06/05/2023 15:48
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 快餐类 抽象构建角色
 * @date 06/05/2023 15:48
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood() {
    }

    public abstract float cost();


    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

