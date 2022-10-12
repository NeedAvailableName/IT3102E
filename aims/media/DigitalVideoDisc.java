package aims.media;

public class DigitalVideoDisc extends Disc implements Playable, Comparable{
    
    public DigitalVideoDisc(String title){
        super(title);
    }

    public DigitalVideoDisc(String title, String category){
        super(title, category);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super(title, category, director, length, cost);
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(Object o) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("");
        dvd = (DigitalVideoDisc) o;
        if(dvd.getCost() > this.getCost())
            return -1;
        if(dvd.getCost() < this.getCost())
            return 1;
        return 0;
    }

}
