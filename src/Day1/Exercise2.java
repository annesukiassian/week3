package Day1;

import java.util.Scanner;
//Write a function static double(double a, int n) calculating the value of a to the power of n
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the double -> ");
        double a = scanner.nextDouble();
        System.out.print("Enter n -> ");
        int n = scanner.nextInt();
        System.out.print(returnNumber(a,n));
    }

    public static double returnNumber(double a, int n) {
        int count = 0;
        double aPower = 1;
        while (count < n) {
            aPower *=a;
            count++;
        }
        return aPower;
    }
}
