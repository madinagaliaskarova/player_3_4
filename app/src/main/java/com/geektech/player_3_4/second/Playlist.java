package com.geektech.player_3_4.second;

public class Playlist {
    private int number;
    private String song;
    private String artist;
    private String lengthSong;


    public Playlist(int number, String song, String artist, String lengthSong) {
        this.number = number;
        this.song = song;
        this.artist = artist;
        this.lengthSong = lengthSong;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLengthSong() {
        return lengthSong;
    }

    public void setLengthSong(String lengthSong) {
        this.lengthSong = lengthSong;
    }
}
