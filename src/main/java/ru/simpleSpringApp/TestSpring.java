package ru.simpleSpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic firstClassicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class); //singleton. init()
        System.out.println(firstClassicalMusic.getSong());//geySong()

        RockMusic firstRockMusic = context.getBean("musicRockBean", RockMusic.class);//prototype. init()
        System.out.println(firstRockMusic.getSong()); //geySong()

        ClassicalMusic secondClassicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class);//singleton. without init()
        System.out.println(secondClassicalMusic.getSong());//geySong()

        RockMusic secondRockMusic = context.getBean("musicRockBean", RockMusic.class);//prototype. init()
        System.out.println(secondRockMusic.getSong()); //geySong()

        JazzMusic jazzMusic = context.getBean("musicJazzBean", JazzMusic.class);//испо-ся фабричный метод
        System.out.println(jazzMusic.getSong());

        context.close();//destroyClassicalMusic()
    }
}
