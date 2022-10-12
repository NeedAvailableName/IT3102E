package aims.media;

public class Disc extends Media{
    private String director;
    private int length;

    public Disc(String title) {
        super(title);
    }
    
    public Disc(String title, String category) {
        super(title, category);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category, String director, int length, float cost){
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public String getDirector(){
        return this.director;
    }

    public int getLength(){
        return this.length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
