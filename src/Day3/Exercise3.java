package Day3;

import java.util.Scanner;

//Write a function which checks if the given String contains a given character.Pass as parameters String str, char ch
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a char ");
        String charString = scanner.nextLine();
        char c = charString.charAt(0);
        System.out.println(checkChar(inputString, c));
    }
    public static boolean checkChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;

            }
        }
        return false;
    }
}
