package com.dengyixuan.structural.adapter_object;/**
 * @Author 85067
 * @create 06/05/2023 15:03
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 06/05/2023 15:03
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard is reading msgL SD";
        return msg;

    }

    @Override
    public void writeSC(String msg) {
        System.out.println("SD CARD is writing" + msg);

    }

}
