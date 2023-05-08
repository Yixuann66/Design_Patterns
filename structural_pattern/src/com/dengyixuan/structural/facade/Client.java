package com.dengyixuan.structural.facade;/**
 * @Author 85067
 * @create 08/05/2023 11:56
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 通 过 SmartApplicationFacade 来 操 作 子 系 统 对客户端屏蔽了子系统组件 外观聚合了子系统的组件
 * <p>
 * 不符合开闭原则，修改很麻烦，修改子系统，可能要修改外观类
 * <p>
 * 实现例子：
 * Tomcat接受浏览器发来的请求，封装成servletRequest
 * 封装成servletRequest，子接口HttpServletRequest
 * <p>
 * 其实request是RequestFacade的类的对象，使用到外观模式
 * RequestFacade聚合了Request类（HttpServletRequest的子实现类）的对象
 * @date 08/05/2023 11:56
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicationFacade smartApplicationFacade = new SmartApplicationFacade();
        smartApplicationFacade.say("打开全部");
        smartApplicationFacade.say("关闭全部");
    }
}
