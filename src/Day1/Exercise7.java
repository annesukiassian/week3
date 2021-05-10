package Day1;

import java.util.Scanner;

//Write a function int factorial(int a), which return factorial of a.
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a -> ");
        int a = scanner.nextInt();
        System.out.print(factorial(a));
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
