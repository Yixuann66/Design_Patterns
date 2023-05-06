package com.dengyixuan.structural.adapter_object;/**
 * @Author 85067
 * @create 06/05/2023 15:03
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 计算机类
 * @date 06/05/2023 15:03
 */
public class Computer {
    public String readSD(SDCard sdCard) {

        if (sdCard == null) {
            throw new NullPointerException("SDCard is not null");
        }

        System.out.println("Computer is reading sd card:" + sdCard.readSD());
        return sdCard.readSD();

    }
}
