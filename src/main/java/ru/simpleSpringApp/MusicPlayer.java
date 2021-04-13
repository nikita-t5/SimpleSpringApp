package ru.simpleSpringApp;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music; //DI
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
