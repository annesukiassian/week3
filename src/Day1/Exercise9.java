package Day1;

import java.util.Scanner;

//Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome; otherwise, it returns false.
// Also write a program to test your method(i.e write another function which will call your isPalindrome function and check if it works right).
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        String n = scanner.nextLine();
        System.out.println(isPalindrome(n));
        System.out.println(checkIsPalindrome(n));
        if (isPalindrome(n)==checkIsPalindrome(n)){
            System.out.print("The method works correctly ");
        }
    }
    public static boolean isPalindrome(String n) {
        int length = n.length();
        if (length == 1) {
            return true;
        } else if (n.charAt(0) == (n.charAt(length - 1))) {
            return true;
        }
        return false;
    }
    public static boolean checkIsPalindrome(String n) {
        int length = n.length();
        if (length == 1) {
            return true;
        } else if (n.charAt(0) == (n.charAt(length - 1))) {
            return true;
        }
        return false;
    }
}
