

public class Track implements Playable, Comparable {
    private String title;
    private int length;

    public Track() {
        super();
    }
    public Track(String title) {
        this.title = title;
    }
    public Track(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track Length: " + this.getLength());
    }

    @Override
    public int compareTo(Object obj) {
        Track temp = (Track)obj;
        if(temp.getTitle().compareTo(this.getTitle()) > 0) {
            return -1;
        }
        if(temp.getTitle().compareTo(this.getTitle()) < 0) {
            return 1;
        }
        return 0;
    }
}