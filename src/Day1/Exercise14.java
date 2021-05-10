package Day1;

import java.util.Random;
import java.util.Scanner;

//Write a method called copyOf(), which takes an int Array and returns a copy of the given array.
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = fillTheArray();
        int[] copyArr = new int[array.length];
        printTheArray(array);
        copyArr = copyOf(array);
        printTheArray(copyArr);
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
    public static int[] copyOf(int[] array) {
        int[] copyArr = new int[array.length];
        int i=0;
        for (int j = 0; j < array.length; j++) {
            copyArr[j] = array[i];
            i++;
        }
        return copyArr;
    }
}
