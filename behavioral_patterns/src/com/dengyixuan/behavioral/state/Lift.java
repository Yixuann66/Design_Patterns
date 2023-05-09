package com.dengyixuan.behavioral.state;/**
 * @Author 85067
 * @create 09/05/2023 11:46
 */

/**
 * @author 85067
 * @version 1.0
 * @description: ILift 的子实现类
 * @date 09/05/2023 11:46
 */
public class Lift implements ILift {

    private int state;

    /**
     * 设置电梯状态
     *
     * @param state
     */
    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("正在开启 不做");
                break;
            case CLOSING_STATE:
                System.out.println("open it");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("open it");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("is running, cannt open");
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("关闭");
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println("is closing");
                break;
            case STOPPING_STATE:
                System.out.println("close it");
                setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("is running, cannt close");
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("is running");
                break;
            case CLOSING_STATE:
                System.out.println("is running");
                break;
            case STOPPING_STATE:
                System.out.println("is running");
                break;
            case RUNNING_STATE:
                System.out.println("is running");
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("stop it");
                setState(STOPPING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println("is stopping");
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("is stopping");
                break;
            case RUNNING_STATE:
                System.out.println("is running,and stop it");
                setState(STOPPING_STATE);
                break;
        }
    }
}
