package Day3;

import java.nio.file.LinkPermission;
import java.util.Locale;
import java.util.Scanner;

//Write a function which returns the count of vowels of a given String
//write also an overloaded function which returns count of constants.
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string -> ");
        String inputString = scanner.nextLine();
        String lowerCase = inputString.toLowerCase(Locale.ROOT);
        System.out.println("The number of vowels " + returnCount(lowerCase));
        System.out.println("The number of constants " + returnCount(lowerCase, 5));
    }
    public static int returnCount(String str) {
        int count = 0;
        String vowels = "auioe";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int returnCount(String str, int b) {
        return str.length() - returnCount(str);
    }
}
