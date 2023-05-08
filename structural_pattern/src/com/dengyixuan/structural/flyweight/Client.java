package com.dengyixuan.structural.flyweight;/**
 * @Author 85067
 * @create 08/05/2023 12:29
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 享元模式，利用共享技术有效的支持大量细粒度对象的复用 共享已经存在的对象 减少需要创建的对象的数量
 * <p>
 * Integer类可以使用享元模式，字符串常量池也是享元模式的思想（多次用到的对象保存起来）
 * IntegerCache是私有的静态的内部类（单例），保存了static final Integer Cache[](缓存-128 - 127 的数字)
 * @date 08/05/2023 12:29
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();

        AbstractBox i = factory.getShape("I");
        String shape = i.getShape();
        i.display("yello");
    }
}
