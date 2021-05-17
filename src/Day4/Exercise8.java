package Day4;

//reverse the string
public class Exercise8 {
    public static void main(String[] args) {
        String s = reverseString("Hello");
        System.out.println(s);
    }

    public static String reverseString(String s) {
        if (s.length() <= 1) {
            return String.valueOf(s.charAt(s.length() - 1));
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
