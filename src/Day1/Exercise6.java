package Day1;

import java.util.Scanner;

//Write function int fib(int n), which for a given natural n returns  n th element.
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n -> ");
        int n = scanner.nextInt();
        System.out.print(fib(n));
    }

    public static int fib(int n) {
        int count = 2;
        int f1 = 0;
        int f2 = 1;
        int f3;
        while (count < n) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            count++;
        }
        return f2;
    }
}
