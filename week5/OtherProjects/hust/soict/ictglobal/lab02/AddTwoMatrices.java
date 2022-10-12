package week5.OtherProjects.hust.soict.ictglobal.lab02;

import java.util.Arrays;
import java.util.Scanner;
public class AddTwoMatrices {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        int m, n, a[][], b[][];
        System.out.println("Enter the size of matrix (m x n):");
        System.out.print("m = ");
        m = keyboard.nextInt();
        System.out.print("n = ");
        n = keyboard.nextInt();
        a = new int[m][n];
        b = new int[m][n];
        System.out.println("Enter the first matrix:");
        inputMatrix(a, m, n);
        System.out.println("Enter the second matrix:");
        inputMatrix(b, m, n);
        System.out.println("Answer: ");
        Add(a, b, m, n);
    }
    public static void inputMatrix(int a[][], int m, int n) {
        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j ++) {
                System.out.print("a" + i + j + " = ");
                a[i][j] = keyboard.nextInt();
            }
        }
    }
    public static void Add(int a[][], int b[][], int m, int n) {
        int c[][];
        c = new int[m][n];
        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j ++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        PrintMatrix(c, m, n);
    }
    public static void PrintMatrix(int a[][], int m, int n) {
        for(int i = 0; i < m; i ++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
