package ru.simpleSpringApp;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) { //DI через конструктор
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
