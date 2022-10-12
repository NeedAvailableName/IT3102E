package aims;

import java.util.ArrayList;
import java.util.Scanner;

import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Track;
import aims.order.Order;

public class Aims {
    static Order order1;
    public static void main(String[] args){
        java.util.Collection collection = new java.util.ArrayList();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Disney", 87, 10);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Action", "John", 124, 15);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Disney", 90, 12);

        Track track1 = new Track("Warmup", 3);
        Track track2 = new Track("Scales", 4);
        Track track3 = new Track("Introduction", 6);
        Track track4 = new Track("ST1", 3);
        Track track5 = new Track("ST2", 4);
        Track track6 = new Track("ST3", 6);
        ArrayList<Track> tracks1 = new ArrayList<Track>();
        ArrayList<Track> tracks2 = new ArrayList<Track>();
        tracks1.add(track1);
        tracks1.add(track2);
        tracks1.add(track3);
        CompactDisc cd1 = new CompactDisc("IBM Symphony", "Classical", 40, "Bethoven", tracks1);
        tracks2.add(track4);
        tracks2.add(track5);
        tracks2.add(track6);
        CompactDisc cd2 = new CompactDisc("Skytour", "Pop", 35, "MT-P", tracks2);

        // collection.add(dvd1);
        // collection.add(dvd2);
        // collection.add(dvd3);
        collection.add(cd2);
        collection.add(cd1);

        cd1.play();
        cd2.play();
        java.util.Iterator iterator = collection.iterator();
        System.out.println("--------------------------");
        System.out.println("The CDs currently in the order: ");

        while(iterator.hasNext()){
            System.out.println(((CompactDisc)iterator.next()).getTitle());
        }

        java.util.Collections.sort((java.util.List)collection);

        iterator = collection.iterator();

        System.out.println("--------------------------");
        System.out.println("The CDs sorted in order: ");

        while(iterator.hasNext()){
            System.out.println(((CompactDisc)iterator.next()).getTitle());
        }
        System.out.println("--------------------------");

        // java.util.Iterator iterator = collection.iterator();
        // System.out.println("--------------------------");
        // System.out.println("The DVDs currently in the order: ");

        // while(iterator.hasNext()){
        //     System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        // }

        // java.util.Collections.sort((java.util.List)collection);

        // iterator = collection.iterator();

        // System.out.println("--------------------------");
        // System.out.println("The DVDs sorted in order: ");

        // while(iterator.hasNext()){
        //     System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        // }
        // System.out.println("--------------------------");

        // Scanner keyboard = new Scanner(System.in);
        // MemoryDaemon mem = new MemoryDaemon();
        // Thread thread = new Thread(mem);
        // thread.setDaemon(true);
        // int choice = -1;
        // int itemChoice = -1;

        // do{
        //     showMenu();
        //     choice = keyboard.nextInt();
        //     switch(choice){
        //         case 0:
        //             System.out.println("Exit!");
        //             break;
        //         case 1:
        //             order1 = new Order();
        //             break;
        //         case 2:
        //             do{
        //                 showItemOption();
        //                 itemChoice = keyboard.nextInt();
        //                 switch(itemChoice){
        //                     case 0:
        //                         break;
        //                     case 1:
        //                         inputBook(keyboard);
        //                         break;
        //                     case 2:
        //                         inputDVD(keyboard);
        //                         break;
        //                     case 3:
        //                         inputCD(keyboard);
        //                         break;
        //                 }
        //             }while(itemChoice < 0 || itemChoice > 3);
        //             break;
        //         case 3:
        //             int id = -1;
        //             System.out.println("Input id for deleting: ");
        //             id = keyboard.nextInt();
        //             order1.removeMedia(id);
        //             break;
        //         case 4:
        //             order1.printList();
        //             break;

        //     }
        // }while(choice != 0);
        // keyboard.close();
        // thread.run();
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        System.out.println();
    }

    public static void showItemOption(){
        System.out.println();
        System.out.println("Adding item: ");
        System.out.println("--------------------------------");
        System.out.println("1. Book");
        System.out.println("2. Digital Video Disc");
        System.out.println("3. Compact Disc");
        System.out.println("0. Return");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        System.out.println();
    }

    public static void inputBook(Scanner keyboard){
        keyboard = new Scanner(System.in);
        String title, category;
        ArrayList<String> authors = new ArrayList<String>();

        System.out.println("Input new book: ");
        System.out.println("Input title: ");
        title = keyboard.nextLine();
        System.out.println("Input category: ");
        category = keyboard.nextLine();
        String authorName = "";
        do{
            System.out.println("Input authors (stop by typing \"End\"): ");
            authorName = keyboard.nextLine();
            if(!authorName.equals("End"))
                authors.add(authorName);
        }while(!authorName.equals("End"));
        order1.addMedia(new Book(title, category, authors));
    }

    public static void inputDVD(Scanner keyboard){
        keyboard = new Scanner(System.in);
        String title, category, director;
        int length;
        float cost;

        System.out.println("Input new DVD: ");
        System.out.println("Input title: ");
        title = keyboard.nextLine();
        System.out.println("Input category: ");
        category = keyboard.nextLine();
        System.out.println("Input director: ");
        director = keyboard.nextLine();
        System.out.println("Input length: ");
        length = keyboard.nextInt();
        System.out.println("Input cost: ");
        cost = keyboard.nextFloat();
        keyboard.nextLine();
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        order1.addMedia(dvd);
        System.out.println("Do you want to play this DVD? (Yes/No)");
        String choice;
        choice = keyboard.nextLine();
        if(choice.equals("Yes")){
            dvd.play();
        }

    }

    public static void inputCD(Scanner keyboard){
        keyboard = new Scanner(System.in);
        String artist;
        ArrayList<Track> tracks = new ArrayList<Track>();
        String title, category, trackTitle;
        float cost;
        
        System.out.println("Input new CD: ");
        System.out.println();
        System.out.println("Input title: ");
        title = keyboard.nextLine();
        System.out.println("Input category: ");
        category = keyboard.nextLine();
        System.out.println("Input cost: ");
        cost = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Input artist: ");
        artist = keyboard.nextLine();
        int length;
        System.out.println("Input list of tracks: ");
        do{
            System.out.println("Input title (stop by typing \"End\"): ");
            trackTitle = keyboard.nextLine();
            
            if(!trackTitle.equals("End")){
                System.out.println("Input length: ");
                length = keyboard.nextInt();
                keyboard.nextLine();
                tracks.add(new Track(trackTitle, length));
            } 
            System.out.println();
        }while(!trackTitle.equals("End"));
        CompactDisc cd = new CompactDisc(title, category, cost, artist, tracks);
        order1.addMedia(cd);
        System.out.println("Do you want to play this CD? (Yes/No)");
        String choice;
        choice = keyboard.nextLine();
        if(choice.equals("Yes")){
            cd.play();
        }
    }

}
