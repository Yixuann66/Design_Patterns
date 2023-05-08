package com.dengyixuan.structural.bridged;/**
 * @Author 85067
 * @create 08/05/2023 11:41
 */

/**
 * @author 85067
 * @version 1.0
 * @description: TODO
 * @date 08/05/2023 11:41
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("mac is reading file: ");
        videoFile.decode(fileName);
    }
}
