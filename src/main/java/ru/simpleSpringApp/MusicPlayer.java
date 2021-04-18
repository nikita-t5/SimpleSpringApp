package ru.simpleSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {

    private Music music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getName(){
        return name;
    }

    public int getVolume(){
        return volume;
    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }

}
