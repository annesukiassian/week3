package Day1;

import java.util.Random;
import java.util.Scanner;

//Write a boolean method called contains(), which takes an array of int and an int; and returns true if the array contains the given int.
public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int key = scanner.nextInt();
        int[] array = fillTheArray();
        printTheArray(array);
        System.out.println(contains(array, key));
        if (checkContains(array,key)==contains(array,key)){
            System.out.println("The Contains method works correctly.");
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
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkContains(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
