package week3;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > 0) {
            for(int i = 0; i < qtyOrdered; i++) {
                if(disc.getTitle().equals(itemsOrdered[i].getTitle())) {
			        itemsOrdered[i] = null;
                }
            }
    	}
	}
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] != null)
				sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
    public void print() {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i] != null) {
                System.out.println((i+1) + " - " + itemsOrdered[i].getTitle() + " - " + 
                    itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + 
                        " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
            }
        }
    }
}
