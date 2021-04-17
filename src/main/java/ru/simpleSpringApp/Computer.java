package ru.simpleSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer musicPlayer; //inject bean с своими зависимостями
    private int id;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
