package com.dengyixuan.behavioral.state;

/**
 * @Author 85067
 * @create 09/05/2023 11:43
 */
public interface ILift {

    /**
     * 定义四个电梯状态的常量
     */
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    /**
     * 设置电梯状态
     *
     * @param state
     */
    void setState(int state);

    void open();

    void close();

    void run();

    void stop();


}
