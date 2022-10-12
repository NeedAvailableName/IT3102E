package week6.hust.soict.ictglobal.aims.Media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public DigitalVideoDisc() {
        super();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}