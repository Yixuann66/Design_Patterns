package com.dengyixuan.behavioral.command;/**
 * @Author 85067
 * @create 08/05/2023 18:43
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 命令模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
 * <p>
 * 命令模式中四种角色：
 * <p>
 * 抽象命令类角色（Command）：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
 * 具体命令角色（Concrete Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 * 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 * 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 * 命令允许请求的一方和接收请求的一方能够独立演化。
 * 优点：-
 * <p>
 * 命令模式使新的命令很容易地被加入到系统里
 * 允许接收请求的一方决定是否要否决(Veto) 请求。
 * 能较容易地设计一个命令队列。
 * 可以容易地实现对请求的Undo和Redo。
 * 在需要的情况下，可以较容易地将命令记入日志。
 * 命令模式把请求一个操作的对象与知道怎么执行一个操作的对象分割开。
 * 命令类与其他任何别的类一样，可以修改和推广。
 * @date 08/05/2023 18:43
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();

        order1.setDiningTable(1);
        order1.setFoot("chicken", 1);
        order1.setFoot("coke", 2);

        Order order2 = new Order();
        order1.setDiningTable(2);
        order1.setFoot("coke2", 2);
        order1.setFoot("chicken2", 1);

        // 接收者 厨师
        SeniorChef receiver = new SeniorChef();
        // 命令对象
        Command orderCommand = new OrderCommand(receiver, order1);
        Command orderCommand2 = new OrderCommand(receiver, order2);

        // 调用者
        Waitor waitor = new Waitor();
        waitor.setCommandList(orderCommand);
        waitor.setCommandList(orderCommand2);

        System.out.println("第一次调用");
        waitor.orderUp();


    }
}
