package ru.simpleSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic; //inject через поле

    private JazzMusic jazzMusic;//inject через конструктор
    private RockMusic rockMusic; ////inject через setter

    @Autowired
    public MusicPlayer(JazzMusic jazzMusic) {
        this.jazzMusic = jazzMusic;
    }

    @Autowired
    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + ", " +
                jazzMusic.getSong() + ", " + rockMusic.getSong();
    }

}
