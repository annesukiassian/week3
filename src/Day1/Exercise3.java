package Day1;

import java.util.Scanner;

//Write a logical xor function, static boolean xor(boolean a, boolean b)
//which returns true or false depending on arguments.
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter boolean statement -> ");
        boolean a = scanner.nextBoolean();
        System.out.print("Enter 2nd boolean -> ");
        boolean b = scanner.nextBoolean();
        System.out.print(xor(a, b));
    }

    public static boolean xor(boolean a, boolean b) {
        if (!a && !b) {
            return false;
        }
        return true;
    }
}
