package com.dengyixuan.builder.builder.chainprogramming;/**
 * @Author 85067
 * @create 05/05/2023 15:13
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 05/05/2023 15:13
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone.Builder().cpu("intel").memory("128g")
                .mainboard("unknown").screen("主板").build();

        System.out.println(phone.toString());
        //Phone{cpu='intel', screen='主板', memory='128g', mainboard='unknown'}
    }
}
