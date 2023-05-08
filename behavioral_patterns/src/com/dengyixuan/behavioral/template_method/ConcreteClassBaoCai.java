package com.dengyixuan.behavioral.template_method;/**
 * @Author 85067
 * @create 08/05/2023 16:18
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体实现子类 实现模板方法的某些算法
 * @date 08/05/2023 16:18
 */
public class ConcreteClassBaoCai extends AbstractClass {
    /**
     * 不同的蔬菜不同的算法
     */
    @Override
    public void pourVegetable() {
        System.out.println("下的是包菜");
    }
}
