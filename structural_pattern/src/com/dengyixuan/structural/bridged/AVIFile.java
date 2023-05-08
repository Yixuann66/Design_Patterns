package com.dengyixuan.structural.bridged;/**
 * @Author 85067
 * @create 08/05/2023 11:36
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体的实现化角色（avi）
 * @date 08/05/2023 11:36
 */
public class AVIFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
