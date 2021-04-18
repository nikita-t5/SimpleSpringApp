package ru.simpleSpringApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.simpleSpringApp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
