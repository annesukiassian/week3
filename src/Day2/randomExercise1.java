package Day2;

import java.util.Random;
import java.util.Scanner;

public class randomExercise1 {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8};
        int[][] matrix = {{3, 5, 8}, {8, 7, 9}};
        System.out.println(average(array));
        System.out.println(average(matrix));
    }

    public static int average(int[] arr) {
        int average = 0;
        int sum = 0;
        int[] array = {4, 5, 7, 8};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    public static int average(int[][] arr) {
        int sum = 0;
        int[][] matrix = {{3, 5, 8}, {8, 7, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
