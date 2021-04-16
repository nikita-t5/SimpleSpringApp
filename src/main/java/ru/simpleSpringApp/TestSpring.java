package ru.simpleSpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music musicJazz = context.getBean("jazzMusic", Music.class);
        Music musicClassical = context.getBean("classicalMusic", Music.class);
        Music musicRock = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(musicJazz);
        musicPlayer1.playMusic();

        MusicPlayer musicPlayer2 = new MusicPlayer(musicClassical);
        musicPlayer2.playMusic();

        MusicPlayer musicPlayer3 = new MusicPlayer(musicRock);
        musicPlayer3.playMusic();

        context.close();
    }
}
