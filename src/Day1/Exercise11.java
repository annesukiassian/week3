package Day1;

import java.util.Scanner;

//Write a program called MagicSum, which prompts users for integers (or -1 to end), and produces the sum of numbers containing the digit 8
public class Exercise11 {
    public static void main(String[] args) {
        magicSum();
    }
    public static void magicSum() {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int number = scanner.nextInt();
            if(number == -1)
                break;
            int temp = number;
            int n = temp % 10;
            while (n > 0) {
                n = temp % 10;
                temp = temp / 10;
                if (n == 8) {
                    sum+=number;
                }
            }

        }
        System.out.println(sum);
    }

}
