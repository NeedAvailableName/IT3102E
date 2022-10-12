package aims.order;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import aims.media.Media;

public class Order {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public static final int MAX_LIMITTED_ORDERED = 10;
    public static int nbOrders = 0;
    public String dateOrdered;
    public int special = -1;

    public Order(){
        super();
        if(nbOrders < MAX_LIMITTED_ORDERED){
            LocalDate myDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dateOrdered = myDate.format(formatter);
            nbOrders += 1;
        }else{
            System.out.println("Cannot add more order, number of orders is full");
            System.exit(0);
        }
    }

    public Order(String dateOrdered) {
        super();
        if(nbOrders < MAX_LIMITTED_ORDERED){
            LocalDate myDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dateOrdered = myDate.format(formatter);
            this.dateOrdered = dateOrdered;
            nbOrders += 1;
        }else{
            System.out.println("Cannot add more order, number of orders is full");
            System.exit(0);
        }
    }

    public String getDateOrdered() {
        return dateOrdered;
    }


    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public void addMedia(Media media){
        if(!itemsOrdered.contains(media)){
            media.setId(itemsOrdered.size() + 1);
            itemsOrdered.add(media);
            System.out.println("Added media successfully!");
        }else{
            System.out.println("Cannot add, media exists in the list!");
        }
    }

    public void removeMedia(Media media){
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            int id = 1;
            for (Media item : itemsOrdered) {
                item.setId(id);
                id ++;
                
            }
            System.out.println("Removed media successfully!");
        }else{
            System.out.println("Cannot remove, media does not exist in the list!");
        }
    }

    public void removeMedia(int id){
        if(id <= 0 ||id >= itemsOrdered.size()){
            System.out.println("Invalid id");
            return;
        }
        removeMedia(itemsOrdered.get(id - 1));  
    }

    public float totalCost(){
        float sum = 0f;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public void removeAll(){
        itemsOrdered.clear();
    }
    // public void printDisc(DigitalVideoDisc disc){
    //     System.out.print(disc.getTitle() + " - " + disc.getCategory() + " - " + disc.getDirector() + " - " + disc.getLength() + " min: " + disc.getCost() + " $");
    //     if(disc.getCost() == 0f){
    //         System.out.print(" (Lucky disc)");
    //     }
    //     System.out.println();
    // }

    public void printList(){
        System.out.println();
        System.out.println("******************Order******************");
        System.out.println("Date: " + getDateOrdered());
        for (Media item : itemsOrdered) {
            System.out.println(item.getId() + ". " + item.getTitle() + " - " + item.getCategory() + " - " + item.getCost() + "$. ");
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("*****************************************");
        System.out.println();
    }

    // public DigitalVideoDisc getALuckyItem(){
    //     Double gift = new Double(String.valueOf(qtyItemsOrdered));
    //     gift *= Math.random();
    //     special = gift.intValue();
    //     itemsOrdered[special].setCost(0f);
    //     return itemsOrdered[special];
    // }
}
