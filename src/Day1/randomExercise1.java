package Day1;

import java.util.Random;
//Print Reversed Array
public class randomExercise1 {
    public static void main(String[] args) {
        int[] arr = initializeArray();
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }
    public static int[] initializeArray() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
        }
    }
}
