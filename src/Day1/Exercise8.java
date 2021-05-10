package Day1;

import java.util.Scanner;

//Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false.
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a -> ");
        String inputString = scanner.nextLine();
        if (isVowel(inputString)) {
            System.out.print("The character is a vowel");
        } else {
            System.out.print("The character is not a vowel");
        }

    }

    public static boolean isVowel(String inputString) {
        char a = inputString.charAt(0);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
