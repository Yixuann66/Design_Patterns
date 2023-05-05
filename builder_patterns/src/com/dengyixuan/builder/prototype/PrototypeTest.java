package com.dengyixuan.builder.prototype;/**
 * @Author 85067
 * @create 04/05/2023 18:18
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 原型模式
 * @date 04/05/2023 18:18
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println(clone);
        System.out.println(realizeType);
        System.out.println(clone==realizeType);
    }
}
