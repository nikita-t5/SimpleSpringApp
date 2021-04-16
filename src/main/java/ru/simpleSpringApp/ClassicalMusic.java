package ru.simpleSpringApp;

import org.springframework.stereotype.Component;

@Component
class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
