package ProjetSong;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private int duration;

    public Song() {
        this("", "", 0, 0);
    }

    public Song(String t, String a, int m, int s) {
        title = t;
        artist = a;
        duration = m * 60 + s;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getMinutes() {
        return duration / 60;

    }

    public int getSeconds() {
        return duration % 60;

    }

    public String toString() {
        return ("\"" + title + "\" by " + artist + " " + (duration / 60) + ":" + (duration % 60));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return duration == song.duration && Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, duration);
    }
}