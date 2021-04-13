package ru.simpleSpringApp;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
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

    public void setMusicList(List<Music> musicList) { //DI через setter
        this.musicList = musicList;
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

    public void playMusicList() {
        for(Music music : musicList){
            System.out.println(music.getSong());
        }
    }
}
