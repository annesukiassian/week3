package Day1;

import java.util.Scanner;

//Write a boolean method called hasEight(), which takes an int as input and returns true if the number contains the digit 8
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int number = scanner.nextInt();
        System.out.print(hasEight(number));
    }
    public static boolean hasEight(int number) {
        int n = number % 10;
        while (n > 0) {
            n = number % 10;
            number = number / 10;
            if (n == 8) {
                return true;
            }
        }
        return false;
    }
}
