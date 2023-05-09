package com.dengyixuan.behavioral.chain_of_responsibility;/**
 * @Author 85067
 * @create 09/05/2023 11:36
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 09/05/2023 11:36
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }


    /**
     * 处理方法
     *
     * @param leaveRequest
     */
    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + leaveRequest.getContent());
        System.out.println("Manager同意");
    }
}
