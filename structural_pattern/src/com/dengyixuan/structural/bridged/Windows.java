package com.dengyixuan.structural.bridged;/**
 * @Author 85067
 * @create 08/05/2023 11:40
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 扩展抽象化角色
 * @date 08/05/2023 11:40
 */
public class Windows extends OperatingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("windows 正在播放：");
        videoFile.decode(fileName);

    }
}
