package Day1;

import java.util.Scanner;

//Write a function static boolean isPrime(int n), where n != 1 and n < 20000000, which return true if n is prime else false.
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int n = scanner.nextInt();
        isPrime(n);
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        return flag;
    }
}
