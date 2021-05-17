package Day3;

import java.util.Scanner;

//Write a function to check if the passed String palindrome or not
public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("xyx"));
    }

    public static boolean checkPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String reverseString = s.toString();
        System.out.println(reverseString);
        if(reverseString.equals(str)){
            return  true;
        }
        return false;
    }
}
