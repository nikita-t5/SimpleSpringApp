package ru.simpleSpringApp;

class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    public void doMyInit() {
        System.out.println("Init Rock music");
    }

    public void doMyDestroy() {
        System.out.println("Destroy Rock music");
    }

}
