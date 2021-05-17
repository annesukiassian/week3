package Day4;

//Given a string, compute recursively a new string where all the 'x' chars
//have been removed.
public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(computeX("kxxh6x"));
    }

    public static String computeX(String str) {
        StringBuilder s = new StringBuilder(str);
        if (s.length() == 0) {
            return "";
        }
        if (s.charAt(0) == 'x') {
            return computeX(s.substring(1));
        }
        return s.charAt(0) + computeX(s.substring(1));
    }
}