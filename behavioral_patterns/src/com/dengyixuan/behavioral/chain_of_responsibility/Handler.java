package com.dengyixuan.behavioral.chain_of_responsibility;/**
 * @Author 85067
 * @create 08/05/2023 20:57
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 抽象处理者
 * @date 08/05/2023 20:57
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;


    /**
     * 领导处理的请假区间
     */
    private int numStart;
    private int numEnd;

    /**
     * 声明后继领导 处理器
     */
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    /**
     * 设置上级领导对象，下一个处理器
     *
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    /**
     * 处理方法
     */
    protected abstract void handlerLeave(LeaveRequest leaveRequest);

    /**
     * 提交请假条
     */
    public final void submit(LeaveRequest leaveRequest) {
        // 领导进行审批
        this.handlerLeave(leaveRequest);
        if (this.nextHandler != null && leaveRequest.getNum() > this.numEnd) {
            this.nextHandler.submit(leaveRequest);

        } else {
            System.out.println("流程结束");
        }
    }

}
