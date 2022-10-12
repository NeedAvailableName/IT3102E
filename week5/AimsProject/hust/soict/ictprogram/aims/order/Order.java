package week5.AimsProject.hust.soict.ictprogram.aims.order;

import week5.AimsProject.hust.soict.ictprogram.aims.disc.DigitalVideoDisc;
import week5.OtherProjects.hust.soict.ictglobal.date.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 5;	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	private static int nbOrders = 0;
	private MyDate dateOrdered = new MyDate();
	private int random = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int num = getQtyOrdered();
		if(nbOrders < MAX_NUMBERS_ORDERED) {
			itemsOrdered[num] = disc;
			setQtyOrdered(num+1);
			nbOrders++;
		}
		else {
			System.out.println("Full order!!!");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int num = getQtyOrdered();
		if(nbOrders + dvdList.length < MAX_NUMBERS_ORDERED) {
			for(int i = 0; i < dvdList.length; i++) {
				itemsOrdered[num] = dvdList[i];
				num++;
				setQtyOrdered(num+1);
				nbOrders++;
			}
		}
		else {
			System.out.println("Full order!!!");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int num = getQtyOrdered();
		if(num < MAX_NUMBERS_ORDERED) {
			itemsOrdered[num] = dvd1;
			num++;
			setQtyOrdered(num+1);
		}
		else {
			System.out.println("Full order!!!");
		}
		if(num < MAX_NUMBERS_ORDERED) {
			itemsOrdered[num] = dvd2;
			num++;
			setQtyOrdered(num+1);
		}
		else {
			System.out.println("Full order!!!");
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
	public DigitalVideoDisc getALuckyItem() {
		random = (int) Math.random();
        itemsOrdered[random].setCost(0);
        return itemsOrdered[random];
	}
    public void print() {
		System.out.println("*********************Order*********************");
		System.out.println("Date: ");
		dateOrdered.print();
		System.out.println("Ordered Items: ");
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i] != null) {
                System.out.println((i+1) + " - " + itemsOrdered[i].getTitle() + " - " + 
                    itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + 
                        " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
            }
        }
    }
}
