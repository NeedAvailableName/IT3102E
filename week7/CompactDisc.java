package week7;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    //private int length;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if(!tracks.contains(track)){
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)){
            tracks.remove(track);
        }
    }

    public int getLength() {
        int total = 0;
        for (Track item : tracks) {
            total += item.getLength();
        }
        return total;
    }

    public void play() {
        System.out.println("Playing CD of " + this.getArtist());
        System.out.println();
        for (Track item : tracks) {
            item.play();
        }
        System.out.println("CD total length: " + this.getLength());
    }
}