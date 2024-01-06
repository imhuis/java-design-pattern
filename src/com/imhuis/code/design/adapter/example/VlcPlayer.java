package com.imhuis.code.design.adapter.example;

/**
 * @author: imhuis
 * @date: 2024/1/3
 * @description:
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.printf("vlc:%s", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.printf("mp4:%s", fileName);
    }
}
