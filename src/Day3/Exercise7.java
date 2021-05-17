package Day3;

import java.util.Locale;
import java.util.Scanner;

//.Caesar's Code
public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(returnUpperCase("AYZ",2));
    }
    public static String returnUpperCase(String str, int n) {
        String cipherText = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = (char)(str.charAt(i) + n);
            if (ch  > 90) {
                ch = (char)(65 + ch - 90);
            }
            cipherText += (char) (ch);
        }
        return cipherText;
    }
}