package ru.simpleSpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer firstMusicPlayerSingleton = context.getBean("musicPlayerSingleton", MusicPlayer.class);
        MusicPlayer secondMusicPlayerSingleton = context.getBean("musicPlayerSingleton", MusicPlayer.class);
        System.out.println(firstMusicPlayerSingleton == secondMusicPlayerSingleton);
        System.out.println("Hash: " + firstMusicPlayerSingleton + "  " + secondMusicPlayerSingleton);
        System.out.println("Volume: " + firstMusicPlayerSingleton.getVolume() + "  " + secondMusicPlayerSingleton.getVolume());
        System.out.println("change volume");
        firstMusicPlayerSingleton.setVolume(100);
        System.out.println("Volume: " + firstMusicPlayerSingleton.getVolume() + "  " + secondMusicPlayerSingleton.getVolume());
        System.out.println();

        MusicPlayer firstMusicPlayerPrototype = context.getBean("musicPlayerPrototype", MusicPlayer.class);
        MusicPlayer secondMusicPlayerPrototype = context.getBean("musicPlayerPrototype", MusicPlayer.class); //
        System.out.println(firstMusicPlayerPrototype == secondMusicPlayerPrototype);
        System.out.println("Hash: " + firstMusicPlayerPrototype + "  " + secondMusicPlayerPrototype);
        System.out.println("Volume: " + firstMusicPlayerPrototype.getVolume() + "  " + secondMusicPlayerPrototype.getVolume());
        System.out.println("change volume");
        firstMusicPlayerPrototype.setVolume(100);
        System.out.println("Volume: " + firstMusicPlayerPrototype.getVolume() + "  " + secondMusicPlayerPrototype.getVolume());
        context.close();
    }
}
