package com.dengyixuan.structural.bridged;/**
 * @Author 85067
 * @create 08/05/2023 11:38
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 抽象的操作系统类（抽象化角色）,聚合实现化角色
 * @date 08/05/2023 11:38
 */

public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
