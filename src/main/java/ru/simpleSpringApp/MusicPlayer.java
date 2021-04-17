package ru.simpleSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    Music music1;//rockMusic - inject через конструктор
    Music music2;//classicalMusic - inject через конструктор
    Music music3;//jazzMusic - inject через сеттер

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    @Autowired
    @Qualifier("jazzMusic")
    public void setJazzMusic(Music music3) {
        this.music3 = music3;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " +
                music2.getSong() + ", " + music3.getSong();
    }
}
