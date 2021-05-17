package Day4;

import java.util.Locale;

//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(computeX("xxxhixxy"));
    }

    public static int computeX(String str) {
        StringBuilder s = new StringBuilder(str);
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) != 'x') {
            return computeX(s.deleteCharAt(0).toString());
        }
        return computeX(s.deleteCharAt(0).toString()) + 1;
    }
}
