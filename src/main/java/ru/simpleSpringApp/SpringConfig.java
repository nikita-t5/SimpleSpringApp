package ru.simpleSpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.simpleSpringApp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean //для создания бина вручную
    public ClassicalMusic classicalMusic() { //classicalMusic - id этого бина
        return new ClassicalMusic(); //новый бин ClassicalMusic
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic()); //внедрение бина classicalMusic вручную
    }

}
