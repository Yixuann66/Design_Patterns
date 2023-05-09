package com.dengyixuan.behavioral.chain_of_responsibility;/**
 * @Author 85067
 * @create 09/05/2023 11:37
 */

/**
 * @author 85067
 * @version 1.0
 * @description: GeneralManager
 * @date 09/05/2023 11:37
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }


    /**
     * 处理方法
     *
     * @param leaveRequest
     */
    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + leaveRequest.getContent());
        System.out.println("GeneralManager同意");
    }
}
