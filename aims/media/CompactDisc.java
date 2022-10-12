package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    // private int length;
    

    public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title) {
        super(title);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track aTrack) {
        if(!tracks.contains(aTrack)){
            tracks.add(aTrack);
            System.out.println("Add track successfully!!!");
        }else{
            System.out.println("Failed to add, track existed in list!");
        }
    }

    public void removeTrack(Track aTrack) {
        if(tracks.contains(aTrack)){
            tracks.remove(aTrack);
            System.out.println("Remove track successfully!!!");
        }else{
            System.out.println("Failed to remove, track did not exist in list1");
        }
    }

    public int getLength(){
        int total = 0;
        for (Track item : tracks) {
            total += item.getLength();
        }
        return total;
    }

    public void play(){
        System.out.println("Playing CD of " + this.getArtist());
        System.out.println("CD total length: " + this.getLength());
        for (Track item : tracks) {
            item.play();
        }
        System.out.println("CD total cost: " + this.getCost() + "$");
    }

    @Override
    public int compareTo(Object o) {
        CompactDisc cd = new CompactDisc("");
        cd = (CompactDisc) o;
        if(cd.tracks.size() > this.tracks.size())
            return -1;
        if(cd.tracks.size() < this.tracks.size())
            return 1;
            
        if(cd.getLength() > this.getLength())
                return -1;
        if(cd.getLength() < this.getLength())
                return 1;
                
        if(cd.getTitle().compareTo(this.getTitle()) > 0)
            return -1;
        if(cd.getTitle().compareTo(this.getTitle()) < 0)
            return 1;

        return 0;
    }
}
