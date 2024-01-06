package com.imhuis.code.design.adapter.example;

import java.lang.management.MemoryType;

/**
 * @author: imhuis
 * @date: 2024/1/3
 * @description:
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AudioType audioType){
        switch (audioType) {
            case VLC, MP4 -> {
                advancedMusicPlayer = new VlcPlayer();
            }
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType){
            case MP4 -> advancedMusicPlayer.playMp4(fileName);
            case VLC -> advancedMusicPlayer.playVlc(fileName);
        }
    }

}
