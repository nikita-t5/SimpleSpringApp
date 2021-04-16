package ru.simpleSpringApp;

class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Init Classical music");
    }

    public void doMyDestroy() {
        System.out.println("Destroy Classical music");
    }

}
