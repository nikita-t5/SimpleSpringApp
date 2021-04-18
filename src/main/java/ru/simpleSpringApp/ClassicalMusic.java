package ru.simpleSpringApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
