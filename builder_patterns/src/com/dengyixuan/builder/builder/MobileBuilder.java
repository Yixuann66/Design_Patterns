package com.dengyixuan.builder.builder;/**
 * @Author 85067
 * @create 04/05/2023 18:57
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体的构建者
 * @date 04/05/2023 18:57
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮");
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
