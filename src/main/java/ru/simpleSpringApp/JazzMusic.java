package ru.simpleSpringApp;

public class JazzMusic implements Music {

    private JazzMusic() {
    }

    public static JazzMusic getJazzMusic() { //factory method
        return new JazzMusic();
    }

    @Override
    public String getSong() {
        return "Some Jazz music";
    }


}
