package ru.simpleSpringApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Some Jazz music";
    }
}
