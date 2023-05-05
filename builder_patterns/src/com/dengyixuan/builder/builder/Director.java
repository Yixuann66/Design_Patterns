package com.dengyixuan.builder.builder;/**
 * @Author 85067
 * @create 04/05/2023 19:00
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 指挥者，通过传入具体的builder，组装具体的产品
 * @date 04/05/2023 19:00
 */
public class Director {

    private Builder builder;


    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
