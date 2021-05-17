package Day4;

//You are given a string containing numbers and English letters (uppercase and lowercase).
// Find and display the number of digits.
public class Exercise13 {
    public static void main(String[] args) {
        System.out.println(calculateDigits("hn78i"));
    }

    public static int calculateDigits(String str) {
        StringBuilder s = new StringBuilder(str);
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) >= 48 && str.charAt(0) <= 57) {
            return calculateDigits(str.substring(1)) + 1;
        }
        return calculateDigits(String.valueOf(s.deleteCharAt(0)));
    }
}
