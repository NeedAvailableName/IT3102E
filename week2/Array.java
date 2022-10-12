package week2;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int n, A[];
        System.out.println("Enter the size of array n =");
        n = keyboard.nextInt();
        A = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter A[" + i + "] = ");
            A[i] = keyboard.nextInt();
        }
        Arrays.sort(A);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(A));
        System.out.println("Sum is: ");
        int sum = Arraysum(A);
        System.out.println(sum);
        System.out.println("Average array is:");
        System.out.println((double)sum / n);
        keyboard.close();
    }

    public static int Arraysum(int a[]) {
        int sum = 0;
        for(int i = 0; i < a.length; i ++) {
            sum += a[i];
        }
        return sum;
    }
}
