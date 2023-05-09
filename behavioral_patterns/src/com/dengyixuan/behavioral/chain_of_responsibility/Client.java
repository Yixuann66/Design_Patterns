package com.dengyixuan.behavioral.chain_of_responsibility;/**
 * @Author 85067
 * @create 08/05/2023 19:09
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 五、职责链模式（本质：分离职责，动态组合）
 * 职责链模式：如果有多个对象有机会处理请求，职责链可使请求的发送者和接受者解耦，请求沿着职责链传递，直到有一个对象处理了它为止。
 * <p>
 * 职责链模式中两种角色：
 * <p>
 * 抽象处理者角色（Handler）：定义出一个处理请求的接口。如果需要，接口可以定义出一个方法以设定和返回对下家的引用。这个角色通常由一个抽象类或接口实现。
 * 具体处理者角色(ConcreteHandler)：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，因此，如果需要，具体处理者司以访问下家。
 * 优点：
 * <p>
 * 请求者和接收者松散耦合
 * 动态组合职责
 * 缺点：
 * <p>
 * 产生很多细粒度对象
 * 不一定能被处理：需要提供默认处理
 * @date 08/05/2023 19:09
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("明", 7, "肚子痛");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);


        groupLeader.submit(leaveRequest);
    }
}
