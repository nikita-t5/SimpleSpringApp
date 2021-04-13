package ru.simpleSpringApp;

public class MusicPlayer {
    Music music;

    public void setMusic(Music music) { //DI через setter
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
