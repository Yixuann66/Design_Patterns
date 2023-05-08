package com.dengyixuan.behavioral.command;/**
 * @Author 85067
 * @create 08/05/2023 18:53
 */

import java.util.Map;
import java.util.Set;

/**
 * @author 85067
 * @version 1.0
 * @description: 具体的命令类 要持有接收者对象
 * @date 08/05/2023 18:53
 */
public class OrderCommand implements Command {

    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("chef is making food");

        System.out.println(order.getDiningTable() + "'s order:");
        Map<String, Integer> foodDir =
                order.getFoodDir();

        Set<String> keySet = foodDir.keySet();

        for (String s : keySet) {
            receiver.makeFood(s, foodDir.get(s));
        }

        System.out.println(order.getDiningTable() + "'s order is finished");
    }
}
