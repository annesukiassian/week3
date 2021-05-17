package Day3;

import java.util.Scanner;

//Write a function called reverseString,which prompts the user for a String,
//and prints the reverse of the String by extracting and processing each character.
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string -> ");
        String inputString = scanner.nextLine();
        System.out.println(reverseString(inputString));
    }
    public static String reverseString(String str){
        StringBuilder reverseString = new StringBuilder(str);
        reverseString.reverse();
        return reverseString.toString();
    }
}
