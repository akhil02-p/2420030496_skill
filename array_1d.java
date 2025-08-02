package MYPROJECT;
import java.util.Scanner;

public class array_1d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
