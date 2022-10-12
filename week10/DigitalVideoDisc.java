package week8;

public class DigitalVideoDisc extends Disc implements Playable, Comparable {

	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost, director, length);
	}

	public void play() throws PlayerException {
		if(this.getLength() <= 0) {
			System.err.println("ERROR: DVD length is 0");
			throw (new PlayerException());
		}
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD category: " + this.getCategory());
		System.out.println("DVD director: " + this.getDirector());
		System.out.println("DVD length: " + this.getLength());
		System.out.println("DVD cost: " + this.getCost());
	}

	@Override
	public int compareTo(Object obj) {
		DigitalVideoDisc temp = new DigitalVideoDisc();
		temp = (DigitalVideoDisc)obj;
		if(temp.getCost() > this.getCost()) {
			return -1;
		}
        if(temp.getCost() < this.getCost()) {
            return 1;
		}
        return 0;
	}
}