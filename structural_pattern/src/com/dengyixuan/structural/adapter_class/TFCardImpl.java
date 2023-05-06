package com.dengyixuan.structural.adapter_class;/**
 * @Author 85067
 * @create 06/05/2023 15:01
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 适配者类
 * @date 06/05/2023 15:01
 */
public class TFCardImpl implements TFCard {

    /**
     * TF卡中读取数据
     *
     * @return
     */
    @Override
    public String readTF() {
        String msg = "TFCard is reading msg : hello world TF card";
        return msg;
    }

    /**
     * 往tf卡中写数据
     */
    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg:" + msg);
    }
}
