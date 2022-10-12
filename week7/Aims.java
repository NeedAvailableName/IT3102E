package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {

	public Aims() {
		super();
	}

	public static void Menu() {
		System.out.println("---------------Menu-------------\n");
		System.out.println("1. Add new Book");
		System.out.println("2. Add new DVD");
		System.out.println("3. Add new CD");
		System.out.println("4. Display order");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		MemoryDaemon memo = new MemoryDaemon();
		Thread thread = new Thread(memo);
		thread.setDaemon(true);
		Order order = new Order();
		do {
			Menu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1: {
					Book book1 = new Book();
					System.out.println("Enter the title");
					book1.setTitle(sc.nextLine());
					System.out.println("Enter the category");
					book1.setCategory(sc.nextLine());
					System.out.println("Enter the cost");
					book1.setCost(sc.nextFloat());
					order.addMedia(book1);
					break;
				}
				case 2: {
					DigitalVideoDisc dvd1 = new DigitalVideoDisc();
					System.out.println("Enter the title");
					dvd1.setTitle(sc.nextLine());
					System.out.println("Enter the category");
					dvd1.setCategory(sc.nextLine());
					System.out.println("Enter the director");
					dvd1.setDirector(sc.nextLine());
					System.out.println("Enter the length");
					dvd1.setLength(sc.nextInt());
					order.addMedia(dvd1);
					dvd1.play();
					break;
				}
				case 3: {
					CompactDisc cd1 = new CompactDisc();
					System.out.println("Enter the title");
					cd1.setTitle(sc.nextLine());
					System.out.println("Enter the artist");
					cd1.setArtist(sc.nextLine());
					System.out.println("Enter the length");
					cd1.setLength(sc.nextInt());
					System.out.println("Enter the cost");
					cd1.setCost(sc.nextInt());
					sc.nextLine();
					order.addMedia(cd1);

					Track track1 = new Track();
					System.out.println("Enter the title of the track");
					track1.setTitle(sc.nextLine());
					System.out.println("Enter the length of the track");
					track1.setLength(sc.nextInt());
					cd1.addTrack(track1);

					cd1.play();
					break;
				}
				case 4: {
					order.showInformation();
					System.out.println("Total Cost: " + order.totalCost());
					break;
				}
				case 6: {
					System.out.println("Exit");
					break;
				}
				default: {
					System.out.println("Try again!");
					break;
				}
			}
		} while (choice != 5);
		sc.close();
		thread.run();
	}
}