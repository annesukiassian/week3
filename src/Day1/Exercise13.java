package Day1;

import java.util.Random;
import java.util.Scanner;

//Write a method called search(), which takes an array of int and an int; and returns the array index if the array contains the given int; or -1 otherwise.
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int key = scanner.nextInt();
        int[] array = fillTheArray();
        printTheArray(array);
        System.out.println(search(array, key));
        if (search(array, key) == checkSearch(array, key)) {
            System.out.println("Search method works correctly ");
        }
    }

    public static int[] fillTheArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the bound of the array -> ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    public static void printTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int search(int[] array, int key) {
        int j = -1;
        for (j = 0; j < array.length; j++) {
            if (array[j] == key) {
                return j;
            }
        }
        return j;
    }

    public static int checkSearch(int[] array, int key) {
        int k = -1;
        for (k = 0; k < array.length; k++) {
            if (array[k] == key) {
                return k;
            }
        }
        return k;
    }
}
