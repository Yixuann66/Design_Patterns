package com.dengyixuan.structural.bridged;/**
 * @Author 85067
 * @create 08/05/2023 11:37
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 具体实现话角色
 * @date 08/05/2023 11:37
 */
public class RmvbFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件:" + fileName);
    }
}
