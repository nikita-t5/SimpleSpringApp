package ru.simpleSpringApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class); //SpringConfig - класс с конфигурациями
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2); //true. scope = singleton

        JazzMusic jazzMusic1 = context.getBean("jazzMusic", JazzMusic.class);
        JazzMusic jazzMusic2 = context.getBean("jazzMusic", JazzMusic.class);
        System.out.println(jazzMusic1 == jazzMusic2); //false. scope = prototype

        context.close();
    }
}
