package com.dengyixuan.builder.builder;/**
 * @Author 85067
 * @create 04/05/2023 18:59
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体构建者
 * @date 04/05/2023 18:59
 */
public class OfoBuilder extends Builder{
    /**
     * 构建车架
     */
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    /**
     * 构建座椅
     */
    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    /**
     * 构建自行车方法
     *
     * @return
     */
    @Override
    public Bike createBike() {
        return bike;
    }
}
