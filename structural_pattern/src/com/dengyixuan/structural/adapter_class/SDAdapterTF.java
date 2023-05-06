package com.dengyixuan.structural.adapter_class;/**
 * @Author 85067
 * @create 06/05/2023 15:07
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 适配器类 实现方式： 实现当前系统的业务接口，继承现有组件库中已经存在的组件
 * @date 06/05/2023 15:07
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter_class read tf card");
        return readTF();
    }

    @Override
    public void writeSC(String msg) {
        System.out.println("adapter_class write tf card");
        writeTF(msg);

    }
}
