package week6.hust.soict.ictglobal.aims.Order;

import java.util.ArrayList;
import java.util.Iterator;
import week6.hust.soict.ictglobal.aims.Media.Media;

public class Order {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public Order() {
		super();
	}
	public void addMedia(Media item) {
		if(!itemsOrdered.contains(item)) {
			itemsOrdered.add(item);
		}
	}
	public void removeMedia(int id) {
		itemsOrdered.remove(id);
	}
	public float totalCost() {
		float sum = 0;
		Media mediaItem;
		Iterator iter = itemsOrdered.iterator();
		while(iter.hasNext()) {
			mediaItem = (Media) iter.next();
			sum += mediaItem.getCost();
		}
		return sum;
	}
	
    public void print() {
		System.out.println("*********************Order*********************");
		System.out.println("Ordered Items: ");
        Media mediaItem;
		Iterator iter = itemsOrdered.iterator();
		while(iter.hasNext()) {
			mediaItem = (Media) iter.next();
			System.out.println(mediaItem.getTitle() + " - " +
                mediaItem.getCategory() + " - " + mediaItem.getCost());
		}
    }
}
