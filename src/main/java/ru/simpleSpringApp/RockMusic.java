package ru.simpleSpringApp;

import org.springframework.stereotype.Component;

@Component
class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
