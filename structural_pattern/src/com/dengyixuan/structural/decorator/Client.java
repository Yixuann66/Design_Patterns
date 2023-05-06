package com.dengyixuan.structural.decorator;/**
 * @Author 85067
 * @create 06/05/2023 16:01
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 06/05/2023 16:01
 */
public class Client {
    public static void main(String[] args) {
        FriesRice food = new FriesRice();
        System.out.println(food.cost() + food.getDesc());

        System.out.println("============");

        FastFood egg = new Egg(food);
        System.out.println(egg.cost() + egg.getDesc());

        FastFood egg2 = new Egg(egg);
        System.out.println(egg2.cost() + egg2.getDesc());
    }
}
