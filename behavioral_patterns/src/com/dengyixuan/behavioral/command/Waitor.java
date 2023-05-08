package com.dengyixuan.behavioral.command;/**
 * @Author 85067
 * @create 08/05/2023 18:56
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author 85067
 * @version 1.0
 * @description: 服务员类 请求者角色 要持有命令对象
 * @date 08/05/2023 18:56
 */
public class Waitor {

    /**
     * 持有多个命令对象
     */
    private List<Command> commandList = new ArrayList<>();

    public void setCommandList(Command cmd) {
        commandList.add(cmd);
    }

    /**
     * 服务员发起命令的方法
     */
    public void orderUp() {
        System.out.println("美女服务员说：有新订单");
        for (Command command : commandList) {

            if (command != null) {
                command.execute();
            }
        }
    }


}
