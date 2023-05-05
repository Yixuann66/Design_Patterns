package com.dengyixuan.builder.builder;/**
 * @Author 85067
 * @create 04/05/2023 18:54
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 抽象构建者
 * @date 04/05/2023 18:54
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建座椅
     */
    public abstract void buildSeat();

    /**
     * 构建自行车方法
     * @return
     */
    public abstract Bike createBike();

}
