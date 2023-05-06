package com.dengyixuan.structural.adapter_object;

/**
 * @Author 85067
 * @Description: 适配者类的接口
 * @create 06/05/2023 15:00
 */
public interface TFCard {

    /**
     * TF卡中读取数据
     *
     * @return
     */
    public abstract String readTF();

    /**
     * 往tf卡中写数据
     */
    public abstract void writeTF(String msg);
}
