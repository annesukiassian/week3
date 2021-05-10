package Day1;

import java.util.Scanner;

//Write a function  which returns the value (true or false) which is more common among
// the values of its arguments x, y, z.
//static boolean election(boolean x, boolean y, boolean z).
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter boolean statement -> ");
        boolean x = scanner.nextBoolean();
        System.out.print("Enter 2nd boolean -> ");
        boolean y = scanner.nextBoolean();
        System.out.print("Enter boolean statement -> ");
        boolean z = scanner.nextBoolean();
        System.out.print(election(x, y, z));

    }
    public static boolean election(boolean x, boolean y, boolean z) {
        if (x && y) {
            return x;
        } else if (y && z) {
            return y;
        } else if (x && z) {
            return x;
        }
        return false;
    }
}
