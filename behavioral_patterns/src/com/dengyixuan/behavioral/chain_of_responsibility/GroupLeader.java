package com.dengyixuan.behavioral.chain_of_responsibility;/**
 * @Author 85067
 * @create 09/05/2023 11:34
 */

/**
 * @author 85067
 * @version 1.0
 * @description: GroupLeader extends Handler
 * @date 09/05/2023 11:34
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    /**
     * 处理方法
     *
     * @param leaveRequest
     */
    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + leaveRequest.getContent());
        System.out.println("小组长同意");
    }
}
