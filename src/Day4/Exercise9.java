package Day4;

//Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(moveX("kxxh6x"));
    }

    public static String moveX(String s) {
        if (s.length() <= 1) {
            return String.valueOf(s.charAt(0));
        }
        if (s.charAt(0) == 'x') {
            return s.substring(1) + "x";
        }
        return s.charAt(0) + moveX(s.substring(1));
    }
}
