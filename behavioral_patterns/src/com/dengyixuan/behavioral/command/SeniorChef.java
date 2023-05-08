package com.dengyixuan.behavioral.command;/**
 * @Author 85067
 * @create 08/05/2023 18:51
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 接受者 厨师类
 * @date 08/05/2023 18:51
 */
public class SeniorChef {


    public void makeFood(String name, int num) {
        System.out.println("making <" + num + "> table's food + " + name);
    }
}
