package ru.simpleSpringApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); //создание app context по xml файлу. И создание бинов, прописаных в нём
        Music music = context.getBean("musicBean", Music.class); //получить созданный бин из appContext
        MusicPlayer musicPlayer = new MusicPlayer(music); //IoC. Ручное внедрение зависимости
        musicPlayer.playMusic();
        context.close(); //закрытие appContext
    }
}
