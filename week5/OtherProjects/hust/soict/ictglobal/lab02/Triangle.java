package week5.OtherProjects.hust.soict.ictglobal.lab02;

import java.util.Scanner;
public class Triangle {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the height of n stars: ");
        int n = keyboard.nextInt();
        for(int i = 1; i <= n; i++) {
            int k = 0;
            for(int sp = 1; sp <= n-i; sp++) {
                System.out.print("  ");
            }
            while(k != 2*i-1) {
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
        }
        keyboard.close();
    }
}
