package ru.simpleSpringApp;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setMusic(Music music) { //DI через setter
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice(){
        return price;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
