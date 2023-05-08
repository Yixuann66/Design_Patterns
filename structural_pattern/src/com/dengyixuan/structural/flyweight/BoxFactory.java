package com.dengyixuan.structural.flyweight;/**
 * @Author 85067
 * @create 08/05/2023 15:39
 */

import javax.swing.*;
import java.util.HashMap;

/**
 * @author 85067
 * @version 1.0
 * @description: 单例工厂类
 * @date 08/05/2023 15:39
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    /**
     * 在构造方法中进行初始化操作
     */
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());

    }

    private static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance() {
        return factory;
    }

    /**
     * 根据名称获取图形对象
     */
    public AbstractBox getShape(String name) {
        return map.get(name);
    }

}
