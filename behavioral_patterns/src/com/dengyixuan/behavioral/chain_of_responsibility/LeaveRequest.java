package com.dengyixuan.behavioral.chain_of_responsibility;/**
 * @Author 85067
 * @create 08/05/2023 20:57
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 请假条类
 * @date 08/05/2023 20:57
 */
public class LeaveRequest {
    private String name;

    private int num;

    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }
}
