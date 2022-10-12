package week6.hust.soict.ictglobal.aims;

import java.util.Scanner;

import week6.hust.soict.ictglobal.aims.Media.DigitalVideoDisc;
import week6.hust.soict.ictglobal.aims.Order.Order;

public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("---------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void main(String args[]) {
        int id = 0;
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        Order newOrder = new Order();
        //ArrayList<media> newMedia = new ArrayList<media>();
        while(opt != 0) {
            showMenu();
            opt = sc.nextInt();
            switch(opt) {
                case 1: {
                    System.out.println("Create successfully!!!");
                    break;
                }
                case 2: {
                    DigitalVideoDisc dvd1 = new DigitalVideoDisc();
                    dvd1.setId(id+1);
                    System.out.println("Enter the name");
                    dvd1.setTitle(sc.nextLine());
                    System.out.println("Enter the category");
                    dvd1.setCategory(sc.nextLine());
                    System.out.println("Enter the cost");
                    dvd1.setCost(sc.nextFloat());
                    System.out.println("Enter the director");
                    dvd1.setDirector(sc.nextLine());
                    System.out.println("Enter the length");
                    dvd1.setLength(sc.nextInt());
                    newOrder.addMedia(dvd1);
                    break;
                }
                case 3: {
                    System.out.println("Enter the id to delete");
                    int newId = sc.nextInt();
                    newOrder.removeMedia(newId);
                    break;   
                }
                case 4: {
                    newOrder.print();
                    break;
                }
                default: break;
            }
        }
        sc.close();
    }
}
