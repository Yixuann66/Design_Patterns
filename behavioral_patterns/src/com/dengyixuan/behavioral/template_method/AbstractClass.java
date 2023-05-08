package com.dengyixuan.behavioral.template_method;/**
 * @Author 85067
 * @create 08/05/2023 16:14
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 抽象类 倒油 热油等步揍
 * @date 08/05/2023 16:14
 */
public abstract class AbstractClass {

    /**
     * 整体的算法骨架
     */
    public final void cookProcess() {
        this.pourOil();
        this.pourVegetable();
        this.fry();


    }

    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 不同的蔬菜不同的算法
     */
    public abstract void pourVegetable();

    public void fry() {
        System.out.println("翻炒");
    }


}
