package Day3;

import java.util.Locale;
import java.util.Scanner;

//Write a program called countVowelsDigits, which get as parameter  a String, counts the number of
//vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints the counts and the percentages
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string -> ");
        String inputString = scanner.nextLine();
        String lowerCase = inputString.toLowerCase(Locale.ROOT);
        countVowelsDigits(inputString);
    }

    public static void countVowelsDigits(String str) {
        int countVowels = 0;
        int countDigits = 0;
        String vowels = "auioe";
        String digits = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    countVowels++;
                }
            }
            for (int k = 0; k < digits.length(); k++) {
                if (str.charAt(i) == digits.charAt(k)) {
                    countDigits++;
                }
            }

        }
        double vowelPerc = countVowels * 100 / str.length();
        double digitPerc = countDigits * 100 / str.length();

        System.out.println("The number of vowels " + countVowels + "(" + vowelPerc + "%)");
        System.out.println("The number of digits " + countDigits + "(" + digitPerc + "%)");
    }

}
