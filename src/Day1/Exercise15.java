package Day1;

import java.util.Scanner;

//Write a program which prompts users for the number of students in a class (a non-negative integer), and saves it in an int variable
// called numStudents. It then prompts the user for the grade of each of the students (integer between 0 to 100) and saves
// them in an int array called grades.
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students - > ");
        int n = scanner.nextInt();
        int j = 1;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the grade for student " + j + " ");
            j++;
            arr[i] = scanner.nextInt();
        }
        System.out.println("The average is " + average(arr));
        System.out.println("The min is " + min(arr));
        System.out.println("The max is " + max(arr));
    }

    public static double average(int[] arr) {
        double average;
        double sum = 0.00;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;
    }

    public static int min(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            } else {
                minIndex = 0;
            }
        }
        return arr[minIndex];
    }

    public static int max(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            } else {
                maxIndex = 0;
            }
        }
        return arr[maxIndex];
    }
}
