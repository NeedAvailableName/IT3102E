package week7;

public class DigitalVideoDisc extends Disc implements Playable {
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

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD director: " + this.getDirector());
		System.out.println("DVD length: " + this.getLength());
	}
}