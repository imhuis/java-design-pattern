package com.imhuis.code.design.adapter.example;

/**
 * @author: imhuis
 * @date: 2024/1/3
 * @description:
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case MP3 -> System.out.println(fileName);
            case MP4 -> {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            }
        }
    }

    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.play(AudioType.MP4, "love, love");
    }

}
